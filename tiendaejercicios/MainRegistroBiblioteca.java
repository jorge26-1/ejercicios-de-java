/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
import java.util.ArrayList;
import java.util.Scanner;

public class MainRegistroBiblioteca {

    public static void RegistroBiblioteca(Scanner scanner ) {
       
        ArrayList<Libro> libros = new ArrayList<>();
        String acumulador = "";
        String respuesta;
        
        do {
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese el número de páginas del libro: ");
            int numeroDePaginas = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Libro libro = new Libro(titulo, autor, numeroDePaginas);
            libros.add(libro);
            acumulador += libro.toString() + "\n";

            System.out.print("¿Desea registrar otro libro? (si/no): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("\nLista de libros registrados:");
        System.out.println(acumulador);

      
    }
}

