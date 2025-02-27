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

public class MainRegistroVentas {
    public static void RegistroVentas (Scanner scanner) {
        
        StringBuilder resumenVentas = new StringBuilder();
        double totalVentas = 0;
        char opcion;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            Venta venta = new Venta(producto, precio);
            resumenVentas.append(venta.getDetalles()).append("\n");
            totalVentas += venta.getPrecio();

            System.out.print("¿Desea registrar otra venta? (s/n): ");
            opcion = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine(); 
        } while (opcion == 's');

        System.out.println("\n Resumen de Ventas:");
        System.out.println(resumenVentas.toString());
        System.out.println(" Total de ventas: $" + totalVentas);

        
    }
}

