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

public class MainJuego {

    public static void Juego(Scanner scanner) {
       

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He generado un número aleatorio entre 1 y 100.");
        System.out.println("¡Intenta adivinarlo!");

        JuegoAdivinanza juego = new JuegoAdivinanza();
        int intento;
        boolean acertado = false;

        while (!acertado) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            acertado = juego.adivinar(intento);
        }

        
    }
}

