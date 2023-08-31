package udem.edu.co.model.entity;

import udem.edu.co.model.abs.Planta;

public class Remolachas extends Planta {
    private String nombre;
    private int edad;
    private float promedio;

    @Override
    public String toString() {
        return "Remolachas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                '}';
    }

    public Remolachas(String nombre, int edad, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
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

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
