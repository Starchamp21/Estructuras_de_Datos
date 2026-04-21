package Estructuras;

public class MainEnlazado {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        // 🔹 Añado elementos.
        lista.aniadir(10);
        lista.aniadir(20);
        lista.aniadir(30);

        System.out.println("Lista tras añadir 10, 20, 30:");
        for(int i = 0; i < lista.tamanio(); i++) {
            System.out.println("Elemento en índice " + i + ": " + lista.acceder(i));
        }

        // 🔹 Añado en posición específica.
        lista.aniadir(15, 1); // Inserto 15 en índice 1.

        System.out.println("\nTras insertar 15 en posición 1:");
        for(int i = 0; i < lista.tamanio(); i++) {
            System.out.println("Elemento en índice " + i + ": " + lista.acceder(i));
        }

        // 🔹 Busco elemento.
        int posicion = lista.buscar(20);
        System.out.println("\nEl elemento 20 está en la posición: " + posicion);

        // 🔹 Borro elemento.
        lista.borrar(2); // Borra el índice 2

        System.out.println("\nTras borrar el índice 2:");
        for(int i = 0; i < lista.tamanio(); i++) {
            System.out.println("Elemento en índice " + i + ": " + lista.acceder(i));
        }

        // 🔹 Tamaño de la lista.
        System.out.println("\nTamaño de la lista: " + lista.tamanio());

        // 🔹 Caso de búsqueda que no existe.
        int noExiste = lista.buscar(999);
        System.out.println("\nBuscar 999 (no existe): " + noExiste);
    }
}