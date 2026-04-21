package Estructuras;

public class MainColaArray {
    public static void main(String[] args) {
        ColaArray<Integer> c = new ColaArray<>();

        c.add(2);
        c.add(5);
        c.add(7);

        System.out.println("Cola: " + c);

        c.poll();

        System.out.println("Después de poll: " + c);

        c.add(10);

        System.out.println("Después de añadir 10: " + c);

        System.out.println("Peek: " + c.peek());
        System.out.println("Empty: " + c.empty());
    }
}