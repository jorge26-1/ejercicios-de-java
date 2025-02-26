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
        
        
        
        SensorTemperatura sensor = new SensorTemperatura();
        
        
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double temperaturaActual = scanner.nextDouble();
        
        
        sensor.verificarTemperatura(temperaturaActual);
        
        
        
    }
}

