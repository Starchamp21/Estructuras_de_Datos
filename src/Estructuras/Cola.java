package Estructuras;

public class Cola<T> implements ICola<T> {
    class Elemento {
        T dato;
        Elemento siguiente;

        public Elemento(T dato) {
            this.dato = dato;
            siguiente = null;
        }

        public Elemento(T dato, Elemento siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }
    }

    Elemento primero, ultimo;
    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public boolean empty() {
        return this.primero == null;
    }

    @Override
    public T poll() {  // Devuelve el elemento del principio y borrarlo.
        if(primero != null) {
            Elemento nuevo_primero = primero.siguiente;
            T dato = primero.dato; // Para no perderlo al cambiar de primero.
            primero = nuevo_primero;

            if(primero == null) {
                ultimo = primero;
            }

            return dato;
        }
        return null;
    }

    @Override
    public void add(T t) {  // Añade un elemento.
        if(ultimo == null) {
            ultimo = new Elemento(t);
            primero = ultimo;
        }
        else {
            Elemento nuevo_penultimo = ultimo;
            ultimo = new Elemento(t);
            nuevo_penultimo.siguiente = ultimo;
        }
    }

    @Override
    public T peek() {  // Miro cuál es el primero, pero no borra.
        if(primero != null) {
            return primero.dato;
        }
        else { return null; }
    }

    @Override
    public String toString() {
        String elementos = "";
        Elemento siguiente = primero;
        while(siguiente != null) {
            elementos += siguiente.dato + ", ";
            siguiente = siguiente.siguiente;
        }
        return elementos;
    }
}