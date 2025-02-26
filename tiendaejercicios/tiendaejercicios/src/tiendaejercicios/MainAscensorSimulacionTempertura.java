/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author inici
 */

    


import java.util.Scanner;

public class MainAscensorSimulacionTempertura {
    public static void AscensorSimulacionTempertura(Scanner scanner) {
        
        System.out.print("Ingrese la temperatura actual: ");
        double temperatura = scanner.nextDouble();
        
        AscensorTemperatura ascensorTemperatura = new AscensorTemperatura(1, temperatura);
        
        System.out.print("Ingrese el piso al que desea ir: ");
        int pisoDestino = scanner.nextInt();
        
        ascensorTemperatura.moverAscensor(pisoDestino);
        
        
    }
}

