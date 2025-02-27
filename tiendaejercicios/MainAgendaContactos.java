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

public class MainAgendaContactos {
    public static void AgendaContactos (Scanner scanner) {
        
        StringBuilder listaContactos = new StringBuilder();

        System.out.print("Ingrese la cantidad de contactos que desea agregar: ");
        int cantidadContactos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= cantidadContactos; i++) {
            System.out.print("Ingrese el nombre del contacto " + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el número de teléfono del contacto " + i + ": ");
            String telefono = scanner.nextLine();

            Contacto contacto = new Contacto(nombre, telefono);
            listaContactos.append(contacto.getDetalles()).append("\n");
        }

        System.out.println("\n Lista de Contactos Registrados:");
        System.out.println(listaContactos.toString());

        
    }
}

