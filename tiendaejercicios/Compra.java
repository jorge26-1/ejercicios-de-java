/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

public class Compra {
    double precioProducto;
    int cantidad;
    double costoTotal;

    public Compra() {
        this.precioProducto = 0;
        this.cantidad = 0;
        this.costoTotal = 0;
    }

    public void agregarProducto(double precio, int cantidad) {
        this.precioProducto = precio;
        this.cantidad = cantidad;
        this.costoTotal += precio * cantidad;
    }

    public double obtenerCostoTotal() {
        return costoTotal;
    }
}

