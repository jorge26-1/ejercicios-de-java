/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    

public class AscensorPeso {
    private double limitePeso; 
    private double pesoActual;  
    private int pisoActual;     
    
    
    public AscensorPeso() {
        this.limitePeso = 500.0; 
        this.pesoActual = 0.0;
        this.pisoActual = 1;      
    }

    
    public int obtenerPisoActual() {
        return pisoActual;
    }

    
    public void irAlPiso(int pisoDestino) {
        if (pesoActual <= limitePeso) {
            pisoActual = pisoDestino;
            System.out.println("El ascensor se está moviendo al piso: " + pisoDestino);
        } else {
            System.out.println("¡El ascensor está sobrecargado! No puede moverse.");
        }
    }

    
    public void agregarPeso(double pesoUsuario) {
        if (pesoActual + pesoUsuario <= limitePeso) {
            pesoActual += pesoUsuario;
            System.out.println("Peso agregado exitosamente. El peso total actual es: " + pesoActual + " kg");
        } else {
            System.out.println("¡El ascensor está sobrecargado! No puede aceptar más peso.");
        }
    }
}

