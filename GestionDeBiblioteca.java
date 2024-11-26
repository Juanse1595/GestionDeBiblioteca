public class GestionDeBiblioteca {

    public static void main(String[] args) {

        // Revista[] biblioteca = new Revista[3];
        //
        // biblioteca[0] = new Revista("Fortune", 21, 167);
        // biblioteca[1] = new Revista("Playboy", 1, 1);
        // biblioteca[2] = new Revista("EliseoArt", 12, 32);
        //
        // biblioteca[0].obtenerInformacion();
        // biblioteca[0].prestar();
        // biblioteca[0].prestar();
        // biblioteca[0].prestar();
        // biblioteca[0].prestar();
        // biblioteca[0].prestar();
        // biblioteca[0].prestar();
        // biblioteca[0].prestar();
        // biblioteca[0].obtenerInformacion();
        // biblioteca[0].devolver();
        // biblioteca[0].devolver();
        // biblioteca[0].obtenerInformacion();
        //
        // biblioteca[1].prestar();
        // biblioteca[1].prestar();
        System.out.println("\033\143");// limpia la consola

        Libro[] biblioteca = new Libro[3];

        biblioteca[0] = new Libro("La Ciudad de los Libros Soñadores", "Walter Moers", 2001, 800);
        biblioteca[1] = new Libro("Harry Potter y la Camara Secreta", "J.K Rolling", 1998, 560);
        biblioteca[2] = new Libro("1984", "George Orwell", 1948, 236);

        // biblioteca[0].obtenerInformacion();

        Biblioteca biblio = new Biblioteca();

        for (Libro libro : biblioteca) {
            biblio.agregarLibro(libro);
        }

        biblio.mostrarLibros();

        System.out.println("=======================================");

        Persona persona1 = new Persona("Luis", "Hernandez");

        biblio.prestarLibro(biblio.getLibros().get(0), persona1);

        System.out.println("=======================================");

        persona1.mostrarLibros();

        System.out.println("=======================================");

        persona1.devolverLibro(biblio.getLibros().get(0));

        System.out.println("=======================================");

        biblio.mostrarLibros();
    }
    public static void menu(Biblioteca biblio){

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Bienvenido");
            System.out.println("Elija la opción: ");
            System.out.println();
            System.out.println("1. Agregar Libro");
            System.out.println("2. Consultar Información");
            System.out.println("3. Salir");

            int opcion = sc.nextInt();
            switch(opcion){
                case 1->{
                    System.out.println("Ingrese el nombre del libro: ");
                    String nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese el año de publicación del libro:");
                    int anio = sc.nextInt();
                    System.out.println("Ingrese el número de páginas del libro:");
                    int numpag = sc.nextInt();
                    biblio.agregarLibro(new Libro(nombre, autor, anio, numpag));
                    System.out.println("Libro ingresado!");
                    System.out.println();
                }
                case 2 ->{
                    System.out.println("Ingrese el nombre del libro: ");
                    String nombre = sc.nextLine();
                    sc.nextLine();
                    for (Libro libro : biblio.getLibros()){
                        if (libro.getNombre().equals(nombre))
                            libro.obtenerInformacion();
                    }
                }
            case 3 ->{
                System.out.println("Saliendo del menu");
                return;
                }
            }
        }
    }
}
