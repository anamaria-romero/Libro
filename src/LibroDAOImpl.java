import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl implements LibroDAO {
    private List<Libro> libros;

    public LibroDAOImpl() {
        libros = new ArrayList<>();
    }

    @Override
    public void crearLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro creado: " + libro);
    }

    @Override
    public Libro obtenerLibroPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    @Override
    public void actualizarLibro(Libro libro) {
        Libro libroExistente = obtenerLibroPorId(libro.getId());
        if (libroExistente != null) {
            libroExistente.setTitulo(libro.getTitulo());
            libroExistente.setAutor(libro.getAutor());
            libroExistente.setAnioPublicacion(libro.getAnioPublicacion());
            System.out.println("Libro actualizado: " + libro);
        } else {
            System.out.println("Libro con ID " + libro.getId() + " no encontrado.");
        }
    }

    @Override
    public void eliminarLibro(int id) {
        Libro libroAEliminar = obtenerLibroPorId(id);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Libro eliminado: " + libroAEliminar);
        } else {
            System.out.println("Libro con ID " + id + " no encontrado.");
        }
    }
}

