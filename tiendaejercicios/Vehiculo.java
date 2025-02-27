/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Vehiculo {
    private String placa;
    private String horaIngreso;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.horaIngreso = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String getDetalles() {
        return " Placa: " + placa + " -  Hora de ingreso: " + horaIngreso;
    }
}

