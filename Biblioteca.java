import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca() {
    }

    public ArrayList<Libro> getLibros() {
        for (Libro librito: this.libros) {
            System.out.println(librito.toString());
        }
        return libros;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }
}
