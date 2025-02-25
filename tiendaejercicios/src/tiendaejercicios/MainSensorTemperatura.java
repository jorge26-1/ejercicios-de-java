/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
import java.util.Scanner;

public class MainSensorTemperatura {
    public static void SensorTemperatura (Scanner scanner) {
        
        
        // Crear un objeto de la clase SensorTemperatura
        SensorTemperatura sensor = new SensorTemperatura();
        
        // Solicitar al usuario la temperatura actual
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double temperaturaActual = scanner.nextDouble();
        
        // Verificar la temperatura utilizando el objeto SensorTemperatura
        sensor.verificarTemperatura(temperaturaActual);
        
        // Cerrar el scanner
        
    }
}

