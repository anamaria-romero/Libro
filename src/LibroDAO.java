import java.util.List;

public interface LibroDAO {
    void crearLibro(Libro libro);
    Libro obtenerLibroPorId(int id);
    List<Libro> obtenerTodosLosLibros();
    void actualizarLibro(Libro libro);
    void eliminarLibro(int id);
}

