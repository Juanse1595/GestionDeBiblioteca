public class Libro extends ItemBiblioteca implements Catalogable {

    // Atributos
    private String nombre;
    private String autor;
    private int anio;
    private int num_pag;
    private boolean prestado;

    // Constructores
    public Libro(String nombre, String autor, int anio, int num_pag) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.num_pag = num_pag;
        prestado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Metodos abstractos
    @Override
    public double calcularMultas() {
        return 100;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public void prestar() {
        prestado = true;
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
                ", prestado=" + prestado +
                '}';
    }

}
