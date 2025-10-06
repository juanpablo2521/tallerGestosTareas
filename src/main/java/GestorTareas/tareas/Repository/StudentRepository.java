package GestorTareas.tareas.Repository;

import GestorTareas.tareas.Entidades.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public Student save(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> findAll() {
        return students;
    }

    public Optional<Student> findById(String id) {
        return students.stream()
                .filter(student -> student.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    public boolean deleteById(String id) {
        return students.removeIf(student -> student.getId().equalsIgnoreCase(id));
    }
}
