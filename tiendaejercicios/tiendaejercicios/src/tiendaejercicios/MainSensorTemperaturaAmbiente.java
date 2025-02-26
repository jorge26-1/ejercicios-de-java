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

public class MainSensorTemperaturaAmbiente {
    public static void SensorTemperaturaAmbiente(Scanner scanner) {
       
        
      
        System.out.print("Ingrese el umbral de alerta en grados Celsius: ");
        double umbralDeAlerta = scanner.nextDouble();
        
      
        SensorTemperaturaAmbiente sensor = new SensorTemperaturaAmbiente(umbralDeAlerta);
        
        
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double temperaturaActual = scanner.nextDouble();
        
        
        sensor.verificarTemperatura(temperaturaActual);
        
    
        
    }
}

