// Crea la clase “Persona” que represente a un usuario de la biblioteca. Debe contener atributos como nombre, apellido y una lista de libros que ha pedido prestado.

import java.util.ArrayList;

public class Persona {
  private String nombre;
  private String apellido;
  private ArrayList<Libro> librosPrestados = new ArrayList<>();

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void mostrarLibros() {
    System.out.println(nombre + " tiene los libros:");
    for (Libro librito : this.librosPrestados) {
      System.out.println(librito.toString());
    }
  }

  public void recibirLibro(Libro libro) {
    librosPrestados.add(libro);
    System.out.println(nombre + " recibio el libro " + libro.getNombre());
  }

  public void devolverLibro(Libro libro) {
    if (!librosPrestados.remove(libro)) {
      System.out.println("Esta persona no tiene ese libro");
    } else {
      System.out.println(nombre + " devolvio el libro " + libro.getNombre());
    }
    libro.devolver();
  }

}
