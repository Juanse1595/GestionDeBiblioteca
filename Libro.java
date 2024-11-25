public class Libro extends ItemBiblioteca implements Catalogable {

    // Atributos
    private String nombre;
    private String autor;
    private int anio;

    // Constructores
    public Libro(String nombre, String autor, int anio) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
    }

    // Metodos abstractos
    @Override
    public double calcularMultas() {
        return 100;
    }

    @Override
    public void devolver() {
        System.out.println("Devolver libro");
    }

    @Override
    public void prestar() {
        System.out.println("Prestar libro");
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Info libro");
    }

}
