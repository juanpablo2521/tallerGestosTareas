package GestorTareas.tareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class GestorTareasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestorTareasApplication.class, args);
        System.out.println("esta corriendo el servidor http://localhost:8080");
    }
}