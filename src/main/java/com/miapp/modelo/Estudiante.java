package com.miapp.modelo;

import com.miapp.modelo.utilidades.EstadoMatricula;
import com.miapp.servicios.Inscribible;
import java.util.ArrayList;

/**
 * Modelo: representa la entidad Estudiante.
 */
public class Estudiante extends Persona implements Inscribible{  

    private static int totalEstudiantes = 0;
    
    public static final int PROMEDIO_MINIMO = 0;
    public static final int PROMEDIO_MAXIMO = 5;
    public static final int MAX_MATERIAS = 6;
    public static final String CARRERA_PREDETERMINADA = "Sin especificar";

    // ── Atributos de instancia ──────────────────────────────────────────────
    private String carrera;
    private double promedio;
    private EstadoMatricula estadoMatricula;
    
    private ArrayList<Curso> cursos;

    // ── Constructor ───────────────────────────────────────────────────────────

    public Estudiante(String carrera, double promedio, String nombre, int id, String apellido) {
        super(nombre, id, apellido);
        this.carrera = carrera;
        this.promedio = promedio;
        this.cursos = new ArrayList<>();
        
         if (promedio >= PROMEDIO_MINIMO && promedio <= PROMEDIO_MAXIMO) {
            this.promedio = promedio;
        } else {
            this.promedio = 0.0;  // Por defecto si está fuera de rango
        }
         
         this.estadoMatricula=EstadoMatricula.ACTIVO;
        
        // nuevo: Incrementa el contador estático de estudiantes
        totalEstudiantes++;
    }
    
    // ── Métodos estáticos (de clase) ──────────────────────────────────────────

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public static void reiniciarContador() {
        totalEstudiantes = 0;
    }

    public static int getProximoId() {  
        return totalEstudiantes + 1;
    
    }

    // ── Getters ──────────────────────────────────────────────────────────
   
    public String getCarrera() { 
        return carrera; 
    }

    public double getPromedio() { 
        return promedio; 
        
    }
    
    public ArrayList<Curso> getCursos(){
        return cursos; 
    }

    // ── Setters ──────────────────────────────────────────────────────────────

    

    public void setCarrera(String carrera) { 
        this.carrera = carrera; 
    }

    /**
     Valida el promedio antes de asignarlo usando constantes finales
     * @param p promedio a validar (debe estar entre PROMEDIO_MINIMO y PROMEDIO_MAXIMO)
     */
    public void setPromedio(double p) {
        // nuevo: Uso de constantes finales para validación
        if (p >= PROMEDIO_MINIMO && p <= PROMEDIO_MAXIMO) {
            this.promedio = p;
        }
    }
    
    public void inscribir(Curso curso) {

        if (curso == null) {
            return;
        }

        if (cursos.size() >= MAX_MATERIAS) {
            return;
        }

        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }
    @Override
    public final String toString() {
        return "ID: " + id
             + " | Nombre: " + nombre
             + " | Apellido: " + apellido   
             + " | Carrera: " + carrera
             + " | Promedio: " + String.format("%.2f", promedio);
    }

    @Override
    public double calcularPago() {
        return 0.0;
    }
}