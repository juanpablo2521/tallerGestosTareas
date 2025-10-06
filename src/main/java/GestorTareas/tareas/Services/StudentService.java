package GestorTareas.tareas.Services;

import GestorTareas.tareas.Entidades.Student;
import java.util.List;

public interface StudentService {
    Student registrarEstudiante(String nombre, String id);
    List<Student> obtenerEstudiantes();
    Student buscarPorId(String id);
    boolean eliminarEstudiante(String id);
}
