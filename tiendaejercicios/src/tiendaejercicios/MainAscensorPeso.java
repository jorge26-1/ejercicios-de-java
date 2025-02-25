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
        
        AscensorPeso ascensorPeso = new AscensorPeso();  // Crear un objeto de la clase Ascensor
        
        System.out.println("Bienvenido al simulador de ascensor.");
        
        // Solicitar al usuario su peso
        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = scanner.nextDouble();
        
        // Verificar si el peso está dentro del límite
        ascensorPeso.agregarPeso(pesoUsuario);
        
        // Solicitar el piso al que desea ir
        System.out.print("Ingrese el piso al que desea ir (1-10): ");
        int pisoDestino = scanner.nextInt();
        
        // Mover el ascensor al piso deseado si el peso es válido
        ascensorPeso.irAlPiso(pisoDestino);

        // Cerrar el scanner
        
    }
}
