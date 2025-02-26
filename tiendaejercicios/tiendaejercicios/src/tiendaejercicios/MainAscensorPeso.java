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

public class MainAscensorPeso {
    public static void AscensorPeso(Scanner scanner){
        
        AscensorPeso ascensorPeso = new AscensorPeso();  
        
        System.out.println("Bienvenido al simulador de ascensor.");
        
        
        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = scanner.nextDouble();
        
        
        ascensorPeso.agregarPeso(pesoUsuario);
        
        
        System.out.print("Ingrese el piso al que desea ir (1-10): ");
        int pisoDestino = scanner.nextInt();
        
        
        ascensorPeso.irAlPiso(pisoDestino);

        
        
    }
}
