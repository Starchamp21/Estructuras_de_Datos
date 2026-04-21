package Estructuras;

public class MainPilaArray {
    public static void main(String[] args) throws Exception {
        Pila<Integer> p = new Pila<>();
        p.push(3);
        p.push(6);
        p.pop();

        System.out.println(p);
    }
}