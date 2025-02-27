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

public class MainTiendaVirtual {
    public static void TiendaVirtual(Scanner scanner ) {
        
        StringBuilder carritoCompras = new StringBuilder();
        double totalCompra = 0;

        System.out.print("Ingrese la cantidad de productos que desea comprar: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            Producto producto = new Producto(nombre, precio);
            carritoCompras.append(producto.getDetalles()).append("\n");
            totalCompra += producto.getPrecio();
        }

        System.out.println("\n Resumen de su compra:");
        System.out.println(carritoCompras.toString());
        System.out.println(" Total a pagar: $" + totalCompra);

    }
}

