/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *
 * @author Nitosh, Cabal
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private int ID;
    private int ciclo;
    private int edad;
    
    public Persona() {
    }
    
    public Persona(String Nombre, String Apellido, int ID,int ciclo,int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID=ID;
        this.ciclo=ciclo;
        this.edad=edad;
    }
    
    public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }
    
    public String getNombre() {
            return Nombre;
        }
    
    public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }
    
    public String getApellido() {
            return Apellido;
        }
    
    public void setID(int ID) {
            this.ID = ID;
        }
    
    public int getID() {
            return ID;
        }
    
    public void setciclo(int ciclo) {
            this.ciclo = ciclo;
        }
    
    public int getciclo() {
            return ciclo;
        }
    
    public void setedad(int edad) {
            this.edad = edad;
        }
    
    public int getedad() {
            return edad;
        }
    
    @Override
    public String toString(){
        return"Persona{nombre="+Nombre+", Apellido="+Apellido+ ", ID="+ID+", ciclo="+ciclo+ ", edad="+edad+"}";
    }
}