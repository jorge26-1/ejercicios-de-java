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
    private double limitePeso;  // Límite máximo de peso del ascensor
    private double pesoActual;  // Peso actual de los usuarios en el ascensor
    private int pisoActual;     // Piso actual en el que se encuentra el ascensor
    
    // Constructor
    public AscensorPeso() {
        this.limitePeso = 500.0;  // Límite de peso por defecto (500 kg)
        this.pesoActual = 0.0;
        this.pisoActual = 1;      // Piso inicial
    }

    // Método para obtener el piso actual
    public int obtenerPisoActual() {
        return pisoActual;
    }

    // Método para ir a un piso
    public void irAlPiso(int pisoDestino) {
        if (pesoActual <= limitePeso) {
            pisoActual = pisoDestino;
            System.out.println("El ascensor se está moviendo al piso: " + pisoDestino);
        } else {
            System.out.println("¡El ascensor está sobrecargado! No puede moverse.");
        }
    }

    // Método para verificar el peso y agregar un nuevo usuario
    public void agregarPeso(double pesoUsuario) {
        if (pesoActual + pesoUsuario <= limitePeso) {
            pesoActual += pesoUsuario;
            System.out.println("Peso agregado exitosamente. El peso total actual es: " + pesoActual + " kg");
        } else {
            System.out.println("¡El ascensor está sobrecargado! No puede aceptar más peso.");
        }
    }
}

