package GestorTareas.tareas.Services.impl;

import GestorTareas.tareas.Entidades.Task;
import GestorTareas.tareas.Repository.TaskRepository;
import GestorTareas.tareas.Services.TaskService;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task crearTarea(String titulo, String descripcion, boolean completada, LocalDate fechaVencimiento) {
        Task tarea = new Task(titulo, descripcion, completada, fechaVencimiento);
        return taskRepository.save(tarea);
    }

    @Override
    public List<Task> obtenerTareas() {
        return taskRepository.findAll();
    }

    @Override
    public Task buscarPorTitulo(String titulo) {
        return taskRepository.findByTitulo(titulo).orElse(null);
    }

    @Override
    public boolean marcarComoCompletada(String titulo) {
        Task tarea = buscarPorTitulo(titulo);
        if (tarea != null && !tarea.isCompletada()) {
            tarea.setCompletada(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarTarea(String titulo) {
        return taskRepository.deleteByTitulo(titulo);
    }
}
