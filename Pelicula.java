public class Pelicula extends ItemBiblioteca implements Catalogable {

    // Atributos
    private String nombre;
    private String director;
    private int anio;

    // Constructores
    public Pelicula(String nombre, String director, int anio) {
        this.nombre = nombre;
        this.director = director;
        this.anio = anio;
    }

    // Metodos abstractos
    @Override
    public double calcularMultas() {
        return 200;
    }

    @Override
    public void devolver() {
        System.out.println("Devolver pelicula");
    }

    @Override
    public void prestar() {
        System.out.println("Prestar pelicula");
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Info peli");
    }
}
