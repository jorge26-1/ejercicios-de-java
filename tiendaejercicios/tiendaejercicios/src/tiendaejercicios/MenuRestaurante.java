/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class MenuRestaurante {
    String platoSeleccionado;
    String bebidaSeleccionada;
    double costoPlato;
    double costoBebida;
    double total;

    public MenuRestaurante(String platoSeleccionado, String bebidaSeleccionada) {
        this.platoSeleccionado = platoSeleccionado;
        this.bebidaSeleccionada = bebidaSeleccionada;
        this.costoPlato = calcularCostoPlato(platoSeleccionado);
        this.costoBebida = calcularCostoBebida(bebidaSeleccionada);
        this.total = costoPlato + costoBebida;
    }

    public double calcularCostoPlato(String plato) {
        double costo = 0;
        switch (plato.toLowerCase()) {
            case "pasta":
                costo = 10.0;
                break;
            case "hamburguesa":
                costo = 8.0;
                break;
            case "ensalada":
                costo = 5.0;
                break;
            case "pizza":
                costo = 12.0;
                break;
            default:
                System.out.println("Plato no válido.");
                break;
        }
        return costo;
    }

    public double calcularCostoBebida(String bebida) {
        double costo = 0;
        switch (bebida.toLowerCase()) {
            case "agua":
                costo = 2.0;
                break;
            case "jugos":
                costo = 3.0;
                break;
            case "refresco":
                costo = 4.0;
                break;
            case "cerveza":
                costo = 5.0;
                break;
            default:
                System.out.println("Bebida no válida.");
                break;
        }
        return costo;
    }

    public double aplicarDescuento(String metodoPago) {
        double descuento = 0;
        switch (metodoPago.toLowerCase()) {
            case "efectivo":
                descuento = 0.1;
                break;
            case "tarjeta de credito":
                descuento = 0.05;
                break;
            case "cheque":
                descuento = 0.07;
                break;
            default:
                System.out.println("Método de pago no válido.");
                break;
        }
        total = total - (total * descuento);
        return total;
    }

    public void mostrarTotal() {
        System.out.println("Plato seleccionado: " + platoSeleccionado);
        System.out.println("Bebida seleccionada: " + bebidaSeleccionada);
        System.out.println("Costo total (sin descuento): " + (costoPlato + costoBebida));
        System.out.println("Costo total con descuento: " + total);
    }
}

