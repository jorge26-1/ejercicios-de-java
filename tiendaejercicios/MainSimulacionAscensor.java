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
        
        Ascensor ascensor = new Ascensor();
        
       
        
        
        System.out.println("Bienvenido al sistema de ascensor.");
        System.out.println("El ascensor está actualmente en el piso: " + ascensor.obtenerPisoActual());
        
     
        System.out.print("Ingrese el número de piso al que desea ir (1-10): ");
        int pisoDestino = scanner.nextInt();
        
     
        ascensor.irAlPiso(pisoDestino);
        
        
        
    }
}
