public class GestionLibrosApp {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        Libro libro1 = new Libro(1, "Cien Años de Soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        libroDAO.crearLibro(libro1);
        libroDAO.crearLibro(libro2);

        System.out.println("Todos los libros:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }

        Libro libroActualizado = new Libro(1, "Cien Años de Soledad (Edición Especial)", "Gabriel García Márquez", 1967);
        libroDAO.actualizarLibro(libroActualizado);

        Libro libroObtenido = libroDAO.obtenerLibroPorId(1);
        System.out.println("Libro obtenido por ID: " + libroObtenido);

        libroDAO.eliminarLibro(2);

        System.out.println("Libros después de la eliminación:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }
    }
}
