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

public class MainRegistroParqueadero {
    public static void RegistroParqueadero(Scanner scanner ) {
        
        StringBuilder registroVehiculos = new StringBuilder();

        System.out.print("Ingrese el número de vehículos a registrar: ");
        int cantidadVehiculos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo " + i + ": ");
            String placa = scanner.nextLine();

            Vehiculo vehiculo = new Vehiculo(placa);
            registroVehiculos.append(vehiculo.getDetalles()).append("\n");
        }

        System.out.println("\n Resumen de Vehículos Registrados:");
        System.out.println(registroVehiculos.toString());

        
    }
}

