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
public class Gerente extends Empleado{
    //metodos
    private int presupuesto;
        
    //constructor
    public Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo,int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    //get and set

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    //sobrecarga
    public void setPresupuesto(int anio, float tasa){
        this.presupuesto += (int) (presupuesto / tasa * anio);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
