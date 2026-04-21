package Estructuras;

public class ListaEnlazada implements IListaEnlazada {
    class Elemento {
        public int dato;
        public Elemento siguiente;

        public Elemento(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
        public Elemento(int dato, Elemento siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }

        public Elemento siguiente() {
            return siguiente;
        }
    }

    Elemento primero;

    public ListaEnlazada() {
        primero = null;
    }
    
    @Override
    public int acceder(int indice) {   
        if(primero == null) {
            return Integer.MIN_VALUE;
        }
        Elemento elem_indice_busq = primero;
        for(int indice_busq = 0; indice_busq < indice; indice_busq++) {
            elem_indice_busq = elem_indice_busq.siguiente;

            if(elem_indice_busq == null) {
                return Integer.MIN_VALUE;
            }
        }
        return elem_indice_busq.dato;
    }

    @Override
    public boolean borrar(int indice) {
        if(primero == null) return false;

        if(indice == 0) {
            primero = primero.siguiente;
            return true;
        }

        Elemento actual = primero;
        for(int i = 0; i < indice - 1; i++) {
            if(actual.siguiente == null) return false;
            actual = actual.siguiente;
        }

        if(actual.siguiente == null) return false;

        actual.siguiente = actual.siguiente.siguiente;
        return true;
    }

    @Override
    public boolean aniadir(int elemento) { // Al final.
        if(primero == null) {
            primero = new Elemento(elemento);
            return true;
        }
        Elemento elem_ultimo = primero;
        while(elem_ultimo.siguiente != null) {
            elem_ultimo = elem_ultimo.siguiente();
        }
        
        elem_ultimo.siguiente = new Elemento(elemento);
        return true;
    }

    @Override
    public boolean aniadir(int elemento, int lugar) { // Donde diga el lugar.
        if(lugar < 0) return false;

        if(lugar == 0) {
            primero = new Elemento(elemento, primero);
            return true;
        }

        Elemento actual = primero;
        for(int i = 0; i < lugar - 1; i++) {
            if(actual == null) return false;
            actual = actual.siguiente;
        }

        if(actual == null) return false;

        actual.siguiente = new Elemento(elemento, actual.siguiente);
        return true;
    }

    @Override
    public int buscar(int elemento) {
        Elemento actual = primero;
        int indice = 0;
        while(actual != null) {
            if(actual.dato == elemento) {
                return indice;
            }
            actual = actual.siguiente;
            indice++;
        }
        return -1; // No encontrado.
    }

    @Override
    public int tamanio() {
        int contador = 0;
        Elemento actual = primero;
        while(actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }
}