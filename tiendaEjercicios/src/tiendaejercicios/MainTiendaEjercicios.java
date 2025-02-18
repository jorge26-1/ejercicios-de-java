/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaejercicios;

/**
 *
 * @author SENA
 */



  

 import java.util.Scanner;

public class MainTiendaEjercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Crear factura");
             System.out.println("2. Crear facturaCompra");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

           
            scanner.nextLine();  
            switch(opcion) {
                case 1:
                    
                    MainFactura mainFactura = new MainFactura();
                    mainFactura.crearFactura(scanner); 
                    break;
                    case 2:
                    
                    MainFacturaCompra mainFacturaCompra = new MainFacturaCompra();
                    mainFacturaCompra.crearFacturaCompra(scanner); 
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 2); 

        scanner.close();
    }
}
