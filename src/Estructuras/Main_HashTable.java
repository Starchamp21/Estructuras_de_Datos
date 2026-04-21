package Estructuras;

public class Main_HashTable {
    public static void main(String[] args) {

        HashTable ht = new HashTable();

        ht.add(3);
        ht.add(7);
        ht.add(103); // Prueba de hash.
        ht.add(203); // Posible colisión.

        System.out.println(ht);

        System.out.println("Buscar 3: " + ht.find(3));
        System.out.println("Buscar 10: " + ht.find(10));
    }
}