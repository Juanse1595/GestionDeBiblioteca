/*
 * Clase Revista: 

Incorpora los atributos nroEdicion, cantidadEjemplares, nombreRevista. Recuerda crear constructores, getters y setters.

Ajuste método prestar(): Este método, restará en 1 la cantidadEjemplares. Tener en cuenta que NO se puede prestar revistas cuyo stock sea cero.

Ajuste método devolver(): Este método, aumentará en 1 la cantidadEjemplares. 

Ajuste método obtenerInformacion(): Este método, deberá imprimir la información de TODOS los atributos de la clase.
 */

public class Revista extends ItemBiblioteca implements Catalogable {

    // Atributos
    private String nombreRevista;
    private int nroEdicion;
    private int cantidadEjemplares;

    // Constructores
    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public Revista() {
    }

    // Getters and Setters
    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    // Metodos abstractos
    @Override
    public double calcularMultas() {
        return 100;
    }

    // Ajuste método devolver(): Este método, aumentará en 1 la cantidadEjemplares.
    @Override
    public void devolver() {
        System.out
                .println("Ejemplar " + nombreRevista + " devuelto. Ahora hay " + ++cantidadEjemplares + " ejemplares");
    }

    // Ajuste método prestar(): Este método, restará en 1 la cantidadEjemplares.
    // Tener en cuenta que NO se puede prestar revistas cuyo stock sea cero.
    @Override
    public void prestar() {
        if (cantidadEjemplares == 0) {
            System.out.println("No hay ejemplares");
        } else {
            System.out.println(
                    "Ejemplar " + nombreRevista + " prestado. Ahora hay " + --cantidadEjemplares + " ejemplares");
        }
    }

    // Ajuste método obtenerInformacion(): Este método, deberá imprimir la
    // información de TODOS los atributos de la clase.
    @Override
    public void obtenerInformacion() {
        System.out.println("Nombre de la revista: " + nombreRevista);
        System.out.println("# Edicion: " + nroEdicion);
        System.out.println("Cantidad ejemplares: " + cantidadEjemplares);
    }

}
