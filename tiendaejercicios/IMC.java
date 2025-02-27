/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class IMC {
    double peso;
    double altura;

    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String categoriaIMC(double imc) {
        String categoria;
        switch ((int) imc) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
            case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17:
                categoria = "Bajo peso";
                break;
            case 18: case 19: case 20: case 21: case 22: case 23:
                categoria = "Peso normal";
                break;
            case 24: case 25: case 26: case 27: case 28: case 29:
                categoria = "Sobrepeso";
                break;
            default:
                categoria = "Obesidad";
                break;
        }
        return categoria;
    }
}

