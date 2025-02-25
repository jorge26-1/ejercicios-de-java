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

public class MainSimulacionAscensor {
    public static void SimulacionAscensor(Scanner scanner) {
        // Crear un objeto de la clase Ascensor
        Ascensor ascensor = new Ascensor();
        
        // Crear un objeto Scanner para leer datos del usuario
        
        
        System.out.println("Bienvenido al sistema de ascensor.");
        System.out.println("El ascensor está actualmente en el piso: " + ascensor.obtenerPisoActual());
        
        // Solicitar al usuario el piso al que desea ir
        System.out.print("Ingrese el número de piso al que desea ir (1-10): ");
        int pisoDestino = scanner.nextInt();
        
        // Llamar al método para mover el ascensor
        ascensor.irAlPiso(pisoDestino);
        
        // Cerrar el scanner
        
    }
}
