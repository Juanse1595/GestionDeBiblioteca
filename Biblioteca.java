import java.util.ArrayList;

// Implementa métodos en la clase “Biblioteca” para permitir que una persona tome prestado un libro (marcándolo como prestado) y para devolver un libro (marcándolo como disponible nuevamente).

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca() {
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    public void mostrarLibros() {
        for (Libro librito : this.libros) {
            System.out.println(librito.toString());
        }
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void prestarLibro(Libro libro, Persona persona) {
        libro.prestar();
        persona.recibirLibro(libro);
        this.mostrarLibros();
    }

}
