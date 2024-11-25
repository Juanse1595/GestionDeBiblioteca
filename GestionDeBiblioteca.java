public class GestionDeBiblioteca {

    public static void main(String[] args) {

        Revista[] biblioteca = new Revista[3];

        biblioteca[0] = new Revista("Fortune", 21, 167);
        biblioteca[1] = new Revista("Playboy", 1, 1);
        biblioteca[2] = new Revista("EliseoArt", 12, 32);

        biblioteca[0].obtenerInformacion();
        biblioteca[0].prestar();
        biblioteca[0].prestar();
        biblioteca[0].prestar();
        biblioteca[0].prestar();
        biblioteca[0].prestar();
        biblioteca[0].prestar();
        biblioteca[0].prestar();
        biblioteca[0].obtenerInformacion();
        biblioteca[0].devolver();
        biblioteca[0].devolver();
        biblioteca[0].obtenerInformacion();

        biblioteca[1].prestar();
        biblioteca[1].prestar();

    }
}
