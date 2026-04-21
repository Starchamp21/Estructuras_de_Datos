package Estructuras;

public interface IListaEnlazada {
    // Acceso.
    public int acceder(int indice);

    // Borrado.
    public boolean borrar(int indice);

    // Añadir.
    public boolean aniadir(int elemento); // Al final.
    public boolean aniadir(int elemento, int lugar); // Donde diga el lugar.

    // Buscar.
    public int buscar(int elemento);

    // Tamaño.
    public int tamanio();
}