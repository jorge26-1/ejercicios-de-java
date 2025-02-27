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

public class MainComidasRapidasOrden {
    public static void ComidasRapidasOrden(Scanner scanner) {
        
        Menu[] menu = {
            new Menu("Hamburguesa", 5.50),
            new Menu("Papas fritas", 2.50),
            new Menu("Refresco", 1.75),
            new Menu("Helado", 3.00)
        };

        double total = 0;
        int opcion;

        do {
            System.out.println("\n--- Menú de Comida Rápida ---");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].getNombre() + " - $" + menu[i].getPrecio());
            }
            System.out.println("5. Finalizar pedido");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                total += menu[opcion - 1].getPrecio();
                System.out.println("Agregado: " + menu[opcion - 1].getNombre());
            } else if (opcion != 5) {
                System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 5);

        System.out.println("\nTotal a pagar: $" + total);
        System.out.println("¡Gracias por su compra!");

        
    }
}

