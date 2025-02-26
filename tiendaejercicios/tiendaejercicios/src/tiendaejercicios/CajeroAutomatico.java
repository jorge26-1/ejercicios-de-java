/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class CajeroAutomatico {
    double saldo;

    public CajeroAutomatico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean verificarMonto(double montoRetiro) {
        if (montoRetiro > saldo) {
            return false;
        }
        saldo -= montoRetiro;
        return true;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}

