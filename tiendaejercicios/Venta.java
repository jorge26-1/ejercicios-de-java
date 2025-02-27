/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class Venta {
    private String producto;
    private double precio;

    public Venta(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getDetalles() {
        return " Producto: " + producto + " -  Precio: $" + precio;
    }

    public double getPrecio() {
        return precio;
    }
}

