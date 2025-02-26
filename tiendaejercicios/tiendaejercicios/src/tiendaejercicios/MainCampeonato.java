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

public class MainCampeonato {

    public static void Campeonato(Scanner scanner) {
         

        System.out.print("Ingrese el nombre del primer equipo: ");
        String equipo1 = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del segundo equipo: ");
        String equipo2 = scanner.nextLine();

        Equipo equipoA = new Equipo(equipo1);
        Equipo equipoB = new Equipo(equipo2);

        System.out.print("Ingrese el resultado del partido (ganado, perdido o empatado): ");
        String resultado1 = scanner.nextLine();

        System.out.print("Ingrese el resultado del partido del segundo equipo (ganado, perdido o empatado): ");
        String resultado2 = scanner.nextLine();

        equipoA.actualizarPuntos(resultado1);
        equipoB.actualizarPuntos(resultado2);

        System.out.println("\nClasificación actual:");
        equipoA.mostrarClasificacion();
        equipoB.mostrarClasificacion();

        
    }
}

