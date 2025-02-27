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

public class MainOficinaImpresora {

    public static void OficinaImpresora(Scanner scanner) {
         
        Impresora impresora = new Impresora(100); 
        String respuesta;

        System.out.println("Bienvenido al sistema de impresión.");

        do {
            System.out.print("Ingrese la cantidad de páginas que desea imprimir: ");
            int cantidadPaginas = scanner.nextInt();

            if (impresora.imprimirPaginas(cantidadPaginas)) {
                System.out.println("Papel restante: " + impresora.obtenerPapelRestante() + " páginas.");
            }

            if (impresora.obtenerPapelRestante() > 0) {
                System.out.print("¿Desea imprimir más páginas? (si/no): ");
                respuesta = scanner.next();
            } else {
                System.out.println("No hay suficiente papel para continuar.");
                respuesta = "no";
            }

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Gracias por usar el sistema de impresión.");
        
    }
}

