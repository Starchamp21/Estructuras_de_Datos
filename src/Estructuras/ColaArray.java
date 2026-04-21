package Estructuras;

public class ColaArray<T> implements ICola<Integer> {

    Integer[] array;
    int primero;
    int ultimo;
    int tamaño;

    public ColaArray() {
        array = new Integer [100];
        primero = 0;
        ultimo = -1;
        tamaño = 0;
    }

    @Override
    public boolean empty() {
        return tamaño == 0;
    }

    @Override
    public Integer poll() {  // Sacar el primero
        if (empty()) return null;

        Integer dato = array[primero];
        primero++;
        tamaño--;

        return dato;
    }

    @Override
    public void add(Integer t) {  // Añadir al final
        if (tamaño == array.length) {
            throw new RuntimeException("Cola llena");
        }

        ultimo++;
        array[ultimo] = t;
        tamaño++;
    }

    @Override
    public Integer peek() {
        if (empty()) return null;
        return array[primero];
    }

    @Override
    public String toString() {
        String elementos = "";
        for(int i = primero; i <= ultimo; i++) {
            elementos += array[i] + ", ";
        }

        return elementos;
    }
}