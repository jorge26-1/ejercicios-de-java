/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */
public class FacturaCompra {
    
    private String cliente;
    private String producto;
    private int cantidad;
    private double precioUnidad;
    private boolean esEstudiante;
    private char tipoCliente;
    
   
    public FacturaCompra(String cliente, String producto, int cantidad, double precioUnidad, boolean esEstudiante, char tipoCliente) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.esEstudiante = esEstudiante;
        this.tipoCliente = tipoCliente;
    }

   
    public double calcularSubtotal() {
        return cantidad * precioUnidad;
    }

    
    public double calcularImpuesto() {
        double subtotal = calcularSubtotal();
        if (esEstudiante) {
            return subtotal * 0.05;  
        } else {
            return subtotal * 0.13;  
        }
    }

   
    public double calcularTotal() {
        return calcularSubtotal() + calcularImpuesto();
    }

    
    public void mostrarFactura() {
        double subtotal = calcularSubtotal();
        double impuesto = calcularImpuesto();
        double total = calcularTotal();
        
        System.out.println("\nFactura:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por unidad: $" + precioUnidad);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("¿Es estudiante? " + (esEstudiante ? "Sí" : "No"));
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total: $" + total);
    }
}




