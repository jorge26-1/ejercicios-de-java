/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

import java.util.Scanner;

/**
 *
 * @author SENA
 */

public class MainFacturaCompra {
    public static void crearFacturaCompra(Scanner scanner) {
       

       
        System.out.println("Ingrese el nombre del cliente:");
        String cliente = scanner.nextLine();

        
        System.out.println("Ingrese el nombre del producto:");
        String producto = scanner.nextLine();

        
        System.out.println("Ingrese la cantidad del producto:");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese el precio por unidad del producto:");
        double precioUnidad = scanner.nextDouble();

        
        System.out.println("¿El cliente es estudiante? (true/false):");
        boolean esEstudiante = scanner.nextBoolean();

        
        System.out.println("Ingrese el tipo de cliente (A, B, C, etc.):");
        char tipoCliente = scanner.next().charAt(0);

        
        FacturaCompra factura = new FacturaCompra(cliente, producto, cantidad, precioUnidad, esEstudiante, tipoCliente);

        
        factura.mostrarFactura();

        
        scanner.close();
    }
}
