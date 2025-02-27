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

public class MainAsistenteNutrisionista {

    public static void CalcularIMC(Scanner scanner) {
        

        System.out.print("Ingrese su peso (en kilogramos): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura (en metros): ");
        double altura = scanner.nextDouble();

        IMC imc = new IMC(peso, altura);

        double resultadoIMC = imc.calcularIMC();

        System.out.println("Su IMC es: " + resultadoIMC);

        String categoria = imc.categoriaIMC(resultadoIMC);

        System.out.println("Categoría de IMC: " + categoria);

       
    }
}

