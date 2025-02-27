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

public class MainCineAsistente {

    public static void AsistenteCine(Scanner scanner) {
         

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        AsistenteCine asistente = new AsistenteCine(edad);

        String recomendacion = asistente.recomendarPelicula();

        System.out.println(recomendacion);

        
    }
}

