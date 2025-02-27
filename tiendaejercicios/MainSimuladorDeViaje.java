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

public class MainSimuladorDeViaje {

    public static void SimuladorDeViaje(Scanner scanner) {
       
        String respuesta;

        System.out.println("Bienvenido al simulador de viaje en coche");

        do {
            System.out.print("Ingrese la distancia total del viaje (en kilómetros): ");
            double distancia = scanner.nextDouble();

            System.out.print("Ingrese la velocidad promedio del coche (en km/h): ");
            double velocidad = scanner.nextDouble();

            ViajeEnCoche viaje = new ViajeEnCoche(distancia, velocidad);

            double tiempoEstimado = viaje.calcularTiempoEstimado();

            System.out.println("El tiempo estimado para su viaje es: " + tiempoEstimado + " horas.");

            System.out.print("¿Desea simular otro viaje? (si/no): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Gracias por utilizar el simulador de viaje en coche.");
        
    }
}

