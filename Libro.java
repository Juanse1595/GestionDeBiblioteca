public class Libro extends ItemBiblioteca implements Catalogable {

    // Atributos
    private String nombre;
    private String autor;
    private int anio;
    private int num_pag;

    // Constructores
    public Libro(String nombre, String autor, int anio, int num_pag) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.num_pag = num_pag;
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
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", anio=" + anio +
                ", num_pag=" + num_pag +
                '}';
    }
}
