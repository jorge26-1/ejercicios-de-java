/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class CuentaRegresiva {
    int numero;

    public CuentaRegresiva(int numero) {
        this.numero = numero;
    }

    public void iniciarCuentaRegresiva() {
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
        System.out.println("¡Tiempo cumplido!");
    }
}

