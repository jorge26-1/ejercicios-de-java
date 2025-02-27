/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

public class CalculadoraSuma {
    private int[] numeros;
    private int sumaTotal;

    public CalculadoraSuma(int cantidadNumeros) {
        this.numeros = new int[cantidadNumeros];
        this.sumaTotal = 0;
    }

    public void agregarNumero(int indice, int numero) {
        numeros[indice] = numero;
        sumaTotal += numero;
    }

    public int getSumaTotal() {
        return sumaTotal;
    }

    public String getListaNumeros() {
        StringBuilder lista = new StringBuilder();
        for (int num : numeros) {
            lista.append(num).append(" ");
        }
        return lista.toString();
    }
}

