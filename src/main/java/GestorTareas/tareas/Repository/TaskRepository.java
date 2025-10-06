package GestorTareas.tareas.Repository;

import GestorTareas.tareas.Entidades.Task;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();


    public Task save(Task task) {
        tasks.add(task);
        return task;
    }


    public List<Task> findAll() {
        return tasks;
    }


    public Optional<Task> findByTitulo(String titulo) {
        return tasks.stream()
                .filter(task -> task.getTitulo().equalsIgnoreCase(titulo))
                .findFirst();
    }


    public boolean deleteByTitulo(String titulo) {
        return tasks.removeIf(task -> task.getTitulo().equalsIgnoreCase(titulo));
    }
}
