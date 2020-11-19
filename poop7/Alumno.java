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
public class Alumno extends Persona {
    private int numTarea;

    public Alumno() {
    }

    public Alumno(int numTarea, String Nombre, String Apellido, int ID, int ciclo, int edad) {
        super(Nombre, Apellido, ID, ciclo, edad);
        this.numTarea = numTarea;
    }

    public int getNumTarea() {
        return numTarea;
    }

    public void setNumTarea(int numTarea) {
        this.numTarea = numTarea;
    }

    @Override
    public String toString() {
        return super.toString() +" "+ "Alumno{" + "numTarea=" + numTarea + '}';
    }
    
    
}
