/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class Impresora {
    int capacidadPapel;
    int papelRestante;

    public Impresora(int capacidadPapel) {
        this.capacidadPapel = capacidadPapel;
        this.papelRestante = capacidadPapel;
    }

    public boolean imprimirPaginas(int cantidadPaginas) {
        if (cantidadPaginas <= papelRestante) {
            papelRestante -= cantidadPaginas;
            System.out.println("Imprimiendo " + cantidadPaginas + " páginas.");
            return true;
        } else {
            System.out.println("Error: No hay suficiente papel para imprimir " + cantidadPaginas + " páginas.");
            return false;
        }
    }

    public int obtenerPapelRestante() {
        return papelRestante;
    }
}

