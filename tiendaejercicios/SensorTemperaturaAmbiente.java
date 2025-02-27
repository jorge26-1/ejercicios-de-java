/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class SensorTemperaturaAmbiente {
    private double umbralAlerta;  
    
    
    public SensorTemperaturaAmbiente(double umbralAlerta) {
        this.umbralAlerta = umbralAlerta;  
    }
    
    
    public void verificarTemperatura(double temperaturaActual) {
        if (temperaturaActual > umbralAlerta) {
            System.out.println("¡Alerta! La temperatura está por encima del umbral.");
        } else {
            System.out.println("La temperatura es normal.");
        }
    }
}

