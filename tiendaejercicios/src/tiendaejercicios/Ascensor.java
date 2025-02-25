/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */
// Clase Ascensor
public class Ascensor {
    // Atributos
    private int pisoActual;
    private final int PISO_MINIMO = 1;
    private final int PISO_MAXIMO = 10;

    // Constructor
    public Ascensor() {
        pisoActual = 1; // El ascensor comienza en el primer piso
    }

    // Método para ir a un piso
    public void irAlPiso(int pisoDestino) {
        // Verificar si el piso es válido
        if (pisoDestino >= PISO_MINIMO && pisoDestino <= PISO_MAXIMO) {
            pisoActual = pisoDestino;
            System.out.println("El ascensor ha llegado al piso " + pisoActual);
        } else {
            System.out.println("Error: El piso " + pisoDestino + " no es válido. Los pisos válidos son del " + PISO_MINIMO + " al " + PISO_MAXIMO);
        }
    }

    // Método para obtener el piso actual
    public int obtenerPisoActual() {
        return pisoActual;
    }
}

