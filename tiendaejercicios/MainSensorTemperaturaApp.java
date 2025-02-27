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

public class MainSensorTemperaturaApp {
    public static void SensorTemperaturaApp(Scanner scanner) {
        
        double tempActual;
        SensorTemperatura_2 sensor;

        do {
            System.out.print("Ingrese la temperatura actual en °C: ");
            tempActual = scanner.nextDouble();
            
            sensor = new SensorTemperatura_2(tempActual);

            if (!sensor.esTemperaturaAceptable()) {
                System.out.println(" Alerta: Temperatura fuera del rango aceptable (18°C - 25°C).");
            } else {
                System.out.println(" La temperatura está dentro del rango aceptable.");
            }

        } while (!sensor.esTemperaturaAceptable());

        System.out.println("️ Sistema estable. Temperatura en rango.");
        
    }
}

