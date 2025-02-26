/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class SensorTemperatura {
    private double temperaturaMinima;  
    private double temperaturaMaxima;  
    
 
    public SensorTemperatura() {
        this.temperaturaMinima = 20.0;
        this.temperaturaMaxima = 35.0;  
    }
    
    
    public void verificarTemperatura(double temperaturaActual) {
        if (temperaturaActual >= temperaturaMinima && temperaturaActual <= temperaturaMaxima) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura está fuera del rango deseado.");
        }
    }
}

