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

public class MainExamen {
    public static void Examen(Scanner scanner ) {
        
        Examen examen = new Examen();
        char opcion;

        do {
            System.out.print("Ingrese la nota del examen: ");
            double nota = scanner.nextDouble();
            examen.agregarNota(nota);

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            opcion = scanner.next().toLowerCase().charAt(0);

        } while (opcion == 's');

        double promedio = examen.calcularPromedio();
        System.out.println("\nPromedio de notas: " + promedio);
        System.out.println("Resultado final: " + examen.determinarResultado());

        
    }
}

