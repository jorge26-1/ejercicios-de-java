/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author inici
 */

    


public class AscensorTemperatura {
    private int pisoActual;
    private double temperatura;
    private static final double TEMP_MIN = 18.0;
    private static final double TEMP_MAX = 30.0;

    public AscensorTemperatura(int pisoInicial, double temperaturaInicial) {
        this.pisoActual = pisoInicial;
        this.temperatura = temperaturaInicial;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void moverAscensor(int pisoDestino) {
        if (temperatura >= TEMP_MIN && temperatura <= TEMP_MAX) {
            System.out.println("Temperatura adecuada. Moviendo el ascensor...");
            this.pisoActual = pisoDestino;
            System.out.println("El ascensor ha llegado al piso " + pisoActual);
        } else {
            System.out.println("Temperatura fuera de rango! No se puede mover el ascensor.");
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public double getTemperatura() {
        return temperatura;
    }
}

