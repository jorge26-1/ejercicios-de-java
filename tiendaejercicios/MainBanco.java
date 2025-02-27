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

public class MainBanco {

    public static void Banco(Scanner scanner) {
        
        CajeroAutomatico cajero = new CajeroAutomatico(10000); 

        System.out.println("Bienvenido al Cajero Automático");

        while (true) {
            System.out.print("Ingrese el monto que desea retirar: ");
            double montoRetiro = scanner.nextDouble();

            if (cajero.verificarMonto(montoRetiro)) {
                System.out.println("Retiro exitoso.");
                System.out.println("Saldo restante: " + cajero.obtenerSaldo());
                break;
            } else {
                System.out.println("Error: El monto excede el saldo disponible.");
                System.out.println("Saldo disponible: " + cajero.obtenerSaldo());
            }
        }

        ;
    }
}

