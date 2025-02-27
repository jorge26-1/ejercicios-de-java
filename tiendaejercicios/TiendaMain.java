/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author inici
 */


import java.util.Scanner;

public class TiendaMain {
    public static void tiendatt(Scanner scanner) {
        
        
        System.out.print("Ingrese el tipo de producto (A - Alimentos, V - Vestimenta, E - Electrónicos): ");
        char tipoProducto = scanner.next().charAt(0);
        
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();
        
        Tienda tienda = new Tienda(tipoProducto, cantidad);
        tienda.calcularCosto();
        
        
    }
}
