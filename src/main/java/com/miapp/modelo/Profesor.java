/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.modelo;

import com.miapp.servicios.IBuscador;

/**
 *
 * @author Estudiante
 */
/*Heredar de Persona.
*Contener el atributo salarioBase, con visibilidad private y declarado como final.
*Implementar el método público impartirClase()
*

/**
 */
public class Profesor extends Persona implements IBuscador{

    private final double salarioBase;

    public Profesor(String nombre, int id, String apellido, double salarioBase) {
        super(nombre, id, apellido);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularPago() {
        return salarioBase;
    }

    public void impartirClase() {
        System.out.println("El profesor " + getNombre() + " está impartiendo una clase.");
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void buscarEstudiante(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarEstudiantePorCarrera(String carrera) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarEstudiantePorCurso(String codigoCurso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarEstudiantePorEstado(String estadoMatricula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cargarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}