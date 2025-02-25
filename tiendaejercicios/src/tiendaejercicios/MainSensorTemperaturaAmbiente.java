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
       
        
        // Solicitar al usuario el umbral de alerta
        System.out.print("Ingrese el umbral de alerta en grados Celsius: ");
        double umbralDeAlerta = scanner.nextDouble();
        
        // Crear un objeto de la clase SensorTemperaturaAmbiente con el umbral de alerta proporcionado
        SensorTemperaturaAmbiente sensor = new SensorTemperaturaAmbiente(umbralDeAlerta);
        
        // Solicitar al usuario la temperatura actual
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double temperaturaActual = scanner.nextDouble();
        
        // Verificar la temperatura utilizando el objeto SensorTemperaturaAmbiente
        sensor.verificarTemperatura(temperaturaActual);
        
        // Cerrar el scanner
        
    }
}

