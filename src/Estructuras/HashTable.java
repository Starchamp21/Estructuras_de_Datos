package Estructuras;

public class HashTable implements IHashTable {
    Integer array[] = new Integer[100];

    public HashTable() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null; // mejor que -1
        }
    }

    @Override
    public void add(Integer i) {
        if (i == null) return;

        int pos = hash(i);

        if (array[pos] == null) {
            array[pos] = i;
        } 
        else if (array[pos].equals(i)) {
            // Ya existe, no hago nada.
        } 
        else {
            int nuevo_tamanio = array.length * 2;

            while (!resize(nuevo_tamanio)) {
                nuevo_tamanio *= 2;
            }

            // Recalculo la posición tras el resize.
            pos = hash(i);
            array[pos] = i;
        }
    }

    @Override
    public int hash(Integer i) {
        return Math.abs(i) % array.length;
    }

    @Override
    public boolean resize(int nuevo_tamanio) {
        Integer nuevo_array[] = new Integer[nuevo_tamanio];

        for (int i = 0; i < nuevo_array.length; i++) {
            nuevo_array[i] = null;
        }

        for (Integer elemento : array) {
            if (elemento != null) {
                int pos = Math.abs(elemento) % nuevo_array.length;

                if (nuevo_array[pos] == null) {
                    nuevo_array[pos] = elemento;
                } else {
                    return false; // Colisión
                }
            }
        }

        array = nuevo_array;
        return true;
    }

    @Override
    public boolean find(Integer i) {
        if (i == null) return false;

        int pos = hash(i);

        return array[pos] != null && array[pos].equals(i);
    }

    @Override
    public String toString() {
        String texto = "{";

        for (Integer elemento : array) {
            if (elemento != null) {
                texto += elemento + ", ";
            }
        }
        texto += "}";
        return texto;
    }
}