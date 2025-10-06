package GestorTareas.tareas.Services;
import GestorTareas.tareas.Entidades.Task;

import java.util.List;

public interface TaskService {
    Task crearTarea(String titulo, String descripcion, boolean completada, java.time.LocalDate fechaVencimiento);
    List<Task> obtenerTareas();
    Task buscarPorTitulo(String titulo);
    boolean marcarComoCompletada(String titulo);
    boolean eliminarTarea(String titulo);
}
