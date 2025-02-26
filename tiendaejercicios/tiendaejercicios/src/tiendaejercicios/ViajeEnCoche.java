/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class ViajeEnCoche {
    double distancia;
    double velocidad;

    public ViajeEnCoche(double distancia, double velocidad) {
        this.distancia = distancia;
        this.velocidad = velocidad;
    }

    public double calcularTiempoEstimado() {
        return distancia / velocidad;
    }
}

