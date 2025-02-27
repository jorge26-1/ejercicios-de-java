/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
import java.util.ArrayList;

public class Examen {
    private ArrayList<Double> notas;

    public Examen() {
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public String determinarResultado() {
        double promedio = calcularPromedio();
        return (promedio >= 6.0) ? "Aprobado " : "Reprobado ";
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
}

