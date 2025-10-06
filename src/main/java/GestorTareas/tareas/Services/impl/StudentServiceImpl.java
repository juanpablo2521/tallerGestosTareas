package GestorTareas.tareas.Services.impl;

import GestorTareas.tareas.Entidades.Student;
import GestorTareas.tareas.Repository.StudentRepository;
import GestorTareas.tareas.Services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student registrarEstudiante(String nombre, String id) {
        Student student = new Student(nombre, id);
        return studentRepository.save(student);
    }

    @Override
    public List<Student> obtenerEstudiantes() {
        return studentRepository.findAll();
    }

    @Override
    public Student buscarPorId(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public boolean eliminarEstudiante(String id) {
        return studentRepository.deleteById(id);
    }
}
