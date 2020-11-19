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
public class Profesor extends Trabajador {
    private String materia;
    private int horas;

    public Profesor() {
    }

    public Profesor(String materia, int horas, String oficio, float sueldo, String Nombre, String Apellido, int ID, int ciclo, int edad) {
        super(oficio, sueldo, Nombre, Apellido, ID, ciclo, edad);
        this.materia = materia;
        this.horas = horas;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Profesor{" + "materia=" + materia + ", horas=" + horas + '}';
    }
    
    
    
}
