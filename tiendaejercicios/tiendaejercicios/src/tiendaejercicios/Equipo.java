/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class Equipo {
    String nombre;
    int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public void actualizarPuntos(String resultado) {
        switch (resultado.toLowerCase()) {
            case "ganado":
                puntos += 3;
                break;
            case "empatado":
                puntos += 1;
                break;
            case "perdido":
                break;
            default:
                System.out.println("Resultado no válido.");
        }
    }

    public void mostrarClasificacion() {
        System.out.println("Equipo: " + nombre + " | Puntos: " + puntos);
    }
}

