/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaejercicios;

import java.util.Scanner;

/**
 *
 * @author SENA
 */

public class tiendaejercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Crear factura");
             System.out.println("2. Crear facturaCompra");
            System.out.println("3. simuladorascensor");
            System.out.println("4. ascensorpeso");
            System.out.println("5. sensortemperatura");
            System.out.println("6. sensortemperaturaAmbiente");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

           
            scanner.nextLine();  
            switch(opcion) {
                case 1:
                    
                    MainFactura mainFactura = new MainFactura();
                    mainFactura.crearFactura(scanner); 
                    break;
                case 2:
                    
                    MainFacturaCompra mainFacturaCompra = new MainFacturaCompra();
                    mainFacturaCompra.crearFacturaCompra(scanner); 
                    break;
                case 3:   
                     MainSimulacionAscensor mainSimulacionAscensor = new MainSimulacionAscensor();
                    mainSimulacionAscensor.SimulacionAscensor(scanner); 
                    break;
                case 4:
                    MainAscensorPeso mainAscensorPeso = new MainAscensorPeso();
                    mainAscensorPeso.AscensorPeso(scanner); 
                    break;
                case 5:
                    MainSensorTemperatura mainSensorTemperatura = new MainSensorTemperatura();
                    mainSensorTemperatura.SensorTemperatura(scanner); 
                    break;
                case 6:
                    MainSensorTemperaturaAmbiente mainSensorTemperaturaAmbiente = new MainSensorTemperaturaAmbiente();
                    mainSensorTemperaturaAmbiente.SensorTemperaturaAmbiente(scanner); 
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6); 

        scanner.close();
    }
}

