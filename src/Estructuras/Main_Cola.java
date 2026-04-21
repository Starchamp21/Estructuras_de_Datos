package Estructuras;

public class Main_Cola {
    public static void main(String[] args) throws Exception {
        Cola<Integer> c = new Cola<>();
        c.add(2);
        c.poll();
        
        c.add(7);
        c.add(1025);

        c.poll();

        System.out.println(c);
    }
}