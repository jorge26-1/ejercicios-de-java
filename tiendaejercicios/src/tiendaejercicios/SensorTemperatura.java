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
    private double temperaturaMinima;  // Temperatura mínima aceptable
    private double temperaturaMaxima;  // Temperatura máxima aceptable
    
    // Constructor
    public SensorTemperatura() {
        this.temperaturaMinima = 20.0;  // Temperatura mínima por defecto
        this.temperaturaMaxima = 35.0;  // Temperatura máxima por defecto
    }
    
    // Método para verificar si la temperatura está dentro del rango aceptable
    public void verificarTemperatura(double temperaturaActual) {
        if (temperaturaActual >= temperaturaMinima && temperaturaActual <= temperaturaMaxima) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura está fuera del rango deseado.");
        }
    }
}

