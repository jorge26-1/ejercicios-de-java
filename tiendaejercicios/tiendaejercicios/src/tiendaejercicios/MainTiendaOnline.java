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

public class MainTiendaOnline {

    public static void TiendaOnline(Scanner scanner ) {
       
        Compra compra = new Compra();
        String respuesta;

        System.out.println("Bienvenido a la tienda en línea");

        do {
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad que desea comprar: ");
            int cantidad = scanner.nextInt();

            compra.agregarProducto(precio, cantidad);

            System.out.print("¿Desea agregar otro producto? (si/no): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("El costo total de su compra es: " + compra.obtenerCostoTotal());
        
    }
}
