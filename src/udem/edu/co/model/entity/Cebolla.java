package udem.edu.co.model.entity;

import udem.edu.co.model.abs.Planta;

public class Cebolla extends Planta {
    private String nombre;
    private int edad;
    private String tipo;
    private float promedio;

    @Override
    public String toString() {
        return "Cebolla{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipo='" + tipo + '\'' +
                ", promedio=" + promedio +
                '}';
    }

    public Cebolla(String nombre, int edad, String tipo, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
