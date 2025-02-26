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

public class MainRestaurante {

    public static void Restaurante( Scanner scanner) {
        

        System.out.println("Menú de Restaurante");
        System.out.println("Platos disponibles: Pasta, Hamburguesa, Ensalada, Pizza");
        System.out.print("Seleccione su plato: ");
        String plato = scanner.nextLine();

        System.out.println("Bebidas disponibles: Agua, Jugos, Refresco, Cerveza");
        System.out.print("Seleccione su bebida: ");
        String bebida = scanner.nextLine();

        MenuRestaurante menu = new MenuRestaurante(plato, bebida);

        System.out.println("\nMétodos de pago disponibles: Efectivo, Tarjeta de Crédito, Cheque");
        System.out.print("Seleccione su método de pago: ");
        String metodoPago = scanner.nextLine();

        menu.aplicarDescuento(metodoPago);
        menu.mostrarTotal();

        ;
    }
}

