package GestorTareas.tareas.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GestorTareas.tareas.Entidades.Task;
import GestorTareas.tareas.Services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TaksController {

    private final TaskService taskService;

    public TaksController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping("/crear")
    public Task crearTarea(@RequestParam String titulo,
                           @RequestParam String descripcion,
                           @RequestParam boolean completada,
                           @RequestParam String fechaVencimiento) {

        LocalDate fecha = LocalDate.parse(fechaVencimiento);
        return taskService.crearTarea(titulo, descripcion, completada, fecha);
    }

    @GetMapping("/listar")
    public List<Task> obtenerTareas() {
        return taskService.obtenerTareas();
    }

    @GetMapping("/{titulo}")
    public Task buscarPorTitulo(@PathVariable String titulo) {
        return taskService.buscarPorTitulo(titulo);
    }


    @PostMapping("/completar")
    public String completarTarea(@RequestParam String titulo) {
        boolean resultado = taskService.marcarComoCompletada(titulo);
        return resultado ? "Tarea completada exitosamente." : "No se encontró la tarea o ya estaba completa.";
    }

    @PostMapping("/eliminar")
    public String eliminarTarea(@RequestParam String titulo) {
        boolean eliminado = taskService.eliminarTarea(titulo);
        return eliminado ? "La tarea se elimino." : "No se encontró la tarea.";
    }
}
