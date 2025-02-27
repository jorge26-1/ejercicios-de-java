/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */

    
public class AsistenteCine {
    int edad;

    public AsistenteCine(int edad) {
        this.edad = edad;
    }

    public String recomendarPelicula() {
        String recomendacion;
        
        if (edad < 7) {
            recomendacion = "Recomendación: Películas animadas y educativas aptas para todas las edades.";
        } else if (edad >= 7 && edad <= 17) {
            recomendacion = "Recomendación: Películas adecuadas para la familia, como animaciones, aventuras y comedias familiares.";
        } else if (edad >= 18 && edad <= 30) {
            recomendacion = "Recomendación: Películas de acción, drama, comedia y ciencia ficción.";
        } else {
            recomendacion = "Recomendación: Películas clásicas y dramas.";
        }

        return recomendacion;
    }
}

