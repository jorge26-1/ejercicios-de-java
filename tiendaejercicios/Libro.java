/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class Libro {
    String titulo;
    String autor;
    int numeroDePaginas;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroDePaginas;
    }
}

