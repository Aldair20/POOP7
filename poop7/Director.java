/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *
 * @author Cabal
 */
public class Director extends Trabajador {
    private String facultad;

    public Director() {
    }

    public Director(String facultad, String oficio, float sueldo, String Nombre, String Apellido, int ID, int ciclo, int edad) {
        super(oficio, sueldo, Nombre, Apellido, ID, ciclo, edad);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Director{" + "facultad=" + facultad + '}';
    }
}
