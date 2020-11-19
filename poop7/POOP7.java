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
public class POOP7 {

    /** Subir a github todo
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.out.println("1---------------------------------------");
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("2---------------------------------------");
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        
        System.out.println("Nombre "+gerente1.getNombre());
        System.out.println("Num empleado "+gerente1.getNumEmpleado());
        System.out.println("Sueldo "+gerente1.getSueldo());
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        System.out.println("3---------------------------------------");
        Gerente gerente2 = new Gerente("Julio",88,200000,500000);
        System.out.println("Nombre "+gerente2.getNombre());
        System.out.println("Num empleado "+gerente2.getNumEmpleado());
        System.out.println("Sueldo "+gerente2.getSueldo());
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        
        System.out.println("4---------------------------------------");
        //sobrescritura
        System.out.println(gerente2);
        
        System.out.println("5---------------------------------------");
        //sobrecarga
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        
        /*
        clase persona
        // 
        System.out.println("6---------------------------------------");
        
        */
        //clase Alumno-Persona
        System.out.println("7---------------------------------------");
        System.out.println("Alumno, hereda de persona: ");
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Isaac");
        alumno1.setApellido("Newton");
        alumno1.setID(317295034);
        alumno1.setciclo(2020);
        alumno1.setedad(18);
        alumno1.setNumTarea(4);
        System.out.println(alumno1.toString());
        
        //clase Trabajador-Persona
        System.out.println("8---------------------------------------");
        System.out.println("Trabajador, hereda de persona");
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("William");
        trabajador1.setApellido("Shakespeare");
        trabajador1.setID(1616);
        trabajador1.setciclo(2020);
        trabajador1.setedad(52);
        trabajador1.setOficio("Poeta");
        trabajador1.setSueldo(32000);
        System.out.println(trabajador1.toString());
        
        
        //clase Director-Trabajador
        System.out.println("9---------------------------------------");
        System.out.println("Director, hereda de trabajador");
        Director director1 = new Director();
        director1.setNombre("Daniel");
        director1.setApellido("Caballero");
        director1.setFacultad("Ingeniería");
        director1.setID(1234);
        director1.setSueldo(24560);
        director1.setOficio("Director");
        director1.setciclo(2020);
        director1.setedad(64);
        System.out.println(director1.toString());
        //clase Profesor-Trabajador
        System.out.println("10---------------------------------------");
        System.out.println("Profesor, hereda de trabajador");
        Profesor profe1 = new Profesor();
        profe1.setNombre("Fidel");
        profe1.setApellido("Diantre");
        profe1.setHoras(5);
        profe1.setMateria("Seguridad informática");
        profe1.setID(564122);
        profe1.setOficio("Maestro");
        profe1.setSueldo(56321);
        profe1.setciclo(2020);
        profe1.setedad(65);
        System.out.println(profe1.toString());
        
    }
    
}
