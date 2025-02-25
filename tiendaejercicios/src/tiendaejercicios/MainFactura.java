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

public class MainFactura {
    public void crearFactura(Scanner scanner) {
        System.out.println("Ingrese el nombre del cliente:");
        String cliente = scanner.nextLine();

        System.out.println("Ingrese el nombre del producto:");
        String producto = scanner.nextLine();

        System.out.println("Ingrese la cantidad del producto:");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese el precio por unidad del producto:");
        double precioUnidad = scanner.nextDouble();

        System.out.println("Ingrese el descuento en porcentaje (ejemplo 10 para un 10%):");
        double descuento = scanner.nextDouble();

        
        Factura factura = new Factura(cliente, producto, cantidad, precioUnidad, descuento);

        
        factura.calcularTotal();
        factura.mostrarFactura();
    }
}
