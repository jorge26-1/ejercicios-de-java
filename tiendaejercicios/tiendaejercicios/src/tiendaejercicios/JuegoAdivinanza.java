/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
import java.util.Random;


public class JuegoAdivinanza {
    int numeroSecreto;
    int intentos;

    public JuegoAdivinanza() {
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        this.intentos = 0;
    }

    public boolean adivinar(int intento) {
        intentos++;
        if (intento > numeroSecreto) {
            System.out.println("El número es menor.");
            return false;
        } else if (intento < numeroSecreto) {
            System.out.println("El número es mayor.");
            return false;
        } else {
            System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            return true;
        }
    }
}

