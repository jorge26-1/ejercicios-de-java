/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class Tarea {
    private String nombre;
    private String descripcion;
    private String fechaVencimiento;

    public Tarea(String nombre, String descripcion, String fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDetalles() {
        return " Tarea: " + nombre + "\n Descripción: " + descripcion + "\n Vence el: " + fechaVencimiento + "\n";
    }
}

