package GestorTareas.tareas.Controllers;

import GestorTareas.tareas.Entidades.Student;
import GestorTareas.tareas.Services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/registrar")
    public Student registrarEstudiante(@RequestParam String nombre,
                                       @RequestParam String id) {
        return studentService.registrarEstudiante(nombre, id);
    }

    @GetMapping("/listar")
    public List<Student> obtenerEstudiantes() {
        return studentService.obtenerEstudiantes();
    }

    @GetMapping("/{id}")
    public Student buscarPorId(@PathVariable String id) {
        return studentService.buscarPorId(id);
    }

    @PostMapping("/eliminar")
    public String eliminarEstudiante(@RequestParam String id) {
        boolean eliminado = studentService.eliminarEstudiante(id);
        return eliminado ? "Se elimino el estudiante." : "No esta el estudiante";
    }
}
