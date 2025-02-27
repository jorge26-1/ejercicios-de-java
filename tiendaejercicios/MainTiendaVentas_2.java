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

public class MainTiendaVentas_2 {
    public static void TiendaVentas_2(Scanner scanner) {
        
        StringBuilder listaVentas = new StringBuilder();
        double totalVentas = 0;

        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad vendida del producto " + i + ": ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            TiendaVenta tiendaVenta  = new TiendaVenta(nombreProducto, precio, cantidad);
            listaVentas.append(Tiendaventa.getDetalles()).append("\n");
            totalVentas += Tiendaventa.getTotal();
        }

        System.out.println("\n Resumen de Ventas:");
        System.out.println(listaVentas.toString());
        System.out.println(" Total de ventas: $" + totalVentas);

        
    }
}

