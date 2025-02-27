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

public class MainSumaNumeros {
    public static void SumaNumeros(Scanner scanner) {
        
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = scanner.nextInt();

        CalculadoraSuma calculadora = new CalculadoraSuma(cantidadNumeros);

        for (int i = 0; i < cantidadNumeros; i++) {
            boolean entradaValida = false;
            int numero = 0;

            while (!entradaValida) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                    entradaValida = true;
                } else {
                    System.out.println(" Entrada no válida. Ingrese un número entero.");
                    scanner.next(); 
            }

            calculadora.agregarNumero(i, numero);
        }

        System.out.println("\n Números ingresados: " + calculadora.getListaNumeros());
        System.out.println(" Suma total: " + calculadora.getSumaTotal());

        }
    }
}
    
    

