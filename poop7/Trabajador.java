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
public class Trabajador extends Persona {
        private String oficio;
        private float sueldo;

    public Trabajador() {
    }

    public Trabajador(String oficio, float sueldo, String Nombre, String Apellido, int ID, int ciclo, int edad) {
        super(Nombre, Apellido, ID, ciclo, edad);
        this.oficio = oficio;
        this.sueldo = sueldo;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Trabajador{" + "oficio=" + oficio + ", sueldo=" + sueldo + '}';
    }
    
    
        
    
}
