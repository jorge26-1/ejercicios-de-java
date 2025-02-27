/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author inici
 */


public class Tienda {
    private char tipoProducto;
    private int cantidad;
    private double precioBase;
    private double descuento;

    public Tienda(char tipoProducto, int cantidad) {
        this.tipoProducto = Character.toUpperCase(tipoProducto);
        this.cantidad = cantidad;
        this.precioBase = obtenerPrecioBase();
        this.descuento = obtenerDescuento();
    }

    private double obtenerPrecioBase() {
        switch (tipoProducto) {
            case 'A': return 10.0; 
            case 'V': return 20.0; 
            case 'E': return 50.0; 
            default: return 0.0;
        }
    }

    private double obtenerDescuento() {
        switch (tipoProducto) {
            case 'A': return 0.10; 
            case 'V': return 0.05; 
            case 'E': return 0.00; 
            default: return 0.00;
        }
    }

    public void calcularCosto() {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad de unidades debe ser un número positivo.");
            return;
        }

        double costoSinDescuento = precioBase * cantidad;
        double descuentoAplicado = costoSinDescuento * descuento;
        double costoFinal = costoSinDescuento - descuentoAplicado;

        System.out.println("Costo sin descuento: $" + costoSinDescuento);
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Costo final con descuento: $" + costoFinal);
    }
}
