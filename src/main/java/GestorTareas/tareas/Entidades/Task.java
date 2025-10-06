package GestorTareas.tareas.Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {
    private String titulo;
    private String descripcion;
    private boolean completada;
    private LocalDate fechaVencimiento;

    public Task() {
    }

    public Task(String titulo, String descripcion, boolean completada, LocalDate fechaVencimiento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
        this.fechaVencimiento = fechaVencimiento;

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}

