public class GestionDeBiblioteca {

    public static void main(String[] args) {

//        Revista[] biblioteca = new Revista[3];
//
//        biblioteca[0] = new Revista("Fortune", 21, 167);
//        biblioteca[1] = new Revista("Playboy", 1, 1);
//        biblioteca[2] = new Revista("EliseoArt", 12, 32);
//
//        biblioteca[0].obtenerInformacion();
//        biblioteca[0].prestar();
//        biblioteca[0].prestar();
//        biblioteca[0].prestar();
//        biblioteca[0].prestar();
//        biblioteca[0].prestar();
//        biblioteca[0].prestar();
//        biblioteca[0].prestar();
//        biblioteca[0].obtenerInformacion();
//        biblioteca[0].devolver();
//        biblioteca[0].devolver();
//        biblioteca[0].obtenerInformacion();
//
//        biblioteca[1].prestar();
//        biblioteca[1].prestar();


        Libro[] biblioteca = new Libro[3];

        biblioteca[0] = new Libro("La Ciudad de los Libros Soñadores", "Walter Moers", 2001, 800);
        biblioteca[1] = new Libro("Harry Potter y la Camara Secreta", "J.K Rolling", 1998,560 );
        biblioteca[2] = new Libro("1984", "George Orwell", 1948, 236);

        biblioteca[0].obtenerInformacion();

        Biblioteca biblio = new Biblioteca();

        for (Libro libro: biblioteca) {
            biblio.agregarLibro(libro);
        }

        biblio.getLibros();
    }
}
