/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class TiendaVenta {
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private double total;

    public TiendaVenta(String nombreProducto, double precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = precio * cantidad;
    }

    public double getTotal() {
        return total;
    }

    public String getDetalles() {
        return "🛒 Producto: " + nombreProducto + " | 💲 Precio: $" + precio + " | 📦 Cantidad: " + cantidad + " | 🔹 Subtotal: $" + total;
    }
}

