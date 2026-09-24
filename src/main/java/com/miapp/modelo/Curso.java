package com.miapp.modelo;

public class Curso {

    private String codigo;
    private int creditos;

    public Curso(String codigo, int creditos) {
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}