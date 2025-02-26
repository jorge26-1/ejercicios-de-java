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

public class MainSimuladorCuentaRegresiva {

    public static void SimuladorCuentaRegresiva(Scanner scanner) {
        

        System.out.println("Bienvenido al simulador de cuenta regresiva.");

        System.out.print("Ingrese un número entero positivo para iniciar la cuenta regresiva: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            CuentaRegresiva cuenta = new CuentaRegresiva(numero);
            cuenta.iniciarCuentaRegresiva();
        } else {
            System.out.println("Por favor, ingrese un número entero positivo.");
        }

        
    }
}

