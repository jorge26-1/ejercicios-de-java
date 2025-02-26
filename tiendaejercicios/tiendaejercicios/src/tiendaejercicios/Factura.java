/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */
public class Factura {
    
    private String cliente;
    private String producto;
    private int cantidad;
    private double precioUnidad;
    private double total;
    private double descuento;

   
    public Factura(String cliente, String producto, int cantidad, double precioUnidad, double descuento) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.descuento = descuento;
        this.total = 0.0;
    }

    

    
    
    public void calcularTotal() {
        double subtotal = cantidad * precioUnidad; 
        total = subtotal - (subtotal * descuento / 100); 
    }

    
    public void mostrarFactura() {
        System.out.println("Factura:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por unidad: $" + precioUnidad);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Total con descuento: $" + total);
    }

}

