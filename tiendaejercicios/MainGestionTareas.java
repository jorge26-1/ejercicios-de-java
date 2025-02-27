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

public class MainGestionTareas {
    public static void GestionTareas(Scanner scanner) {
        
        StringBuilder listaTareas = new StringBuilder();
        char opcion;

        do {
            System.out.print("Ingrese el nombre de la tarea: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese la descripción de la tarea: ");
            String descripcion = scanner.nextLine();
            
            System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
            String fechaVencimiento = scanner.nextLine();

            Tarea tarea = new Tarea(nombre, descripcion, fechaVencimiento);
            listaTareas.append(tarea.getDetalles()).append("\n");

            System.out.print("¿Desea agregar otra tarea? (s/n): ");
            opcion = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine(); 

        } while (opcion == 's');

        System.out.println("\n Lista de Tareas:");
        System.out.println(listaTareas.toString());

        
    }
}

