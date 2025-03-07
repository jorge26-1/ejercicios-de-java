/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaejercicios;

import java.util.Scanner;

/**
 *
 * @author SENA
 */

public class tiendaejercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Crear factura");
             System.out.println("2. Crear facturaCompra");
            System.out.println("3. simuladorascensor");
            System.out.println("4. ascensorpeso");
            System.out.println("5. sensortemperatura");
            System.out.println("6. sensortemperaturaAmbiente");
            System.out.println("7. AscensorSimulacionTempertura");
            System.out.println("8. tienda");
            System.out.println("9. Calcular el IMC");
            System.out.println("10. asistente cine");
            System.out.println("11. CAMPEONATO");
            System.out.println("12. Menu restaurante");
            System.out.println("13. cajero automatico");
            System.out.println("14. Tienda Online");
            System.out.println("15. oficina impresora");
            System.out.println("16. viaje en coche");
            System.out.println("17. cuenta regresiva");
            System.out.println("18. juego adivinanza");
            System.out.println("19. biblioteca");
            System.out.println("20. Menu comidas rapidas");
            System.out.println("21. sensor temperatura_2");
            System.out.println("22. examen");
            System.out.println("23. Tareas");
            System.out.println("24. ventas");
            System.out.println("25. registro parqueadero");
            System.out.println("26. tienda virtual");
            System.out.println("27. agenda de contactos");
            System.out.println("28. Calculadora");
            System.out.println("29. Salir");
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
                     MainSimulacionAscensor mainSimulacionAscensor = new MainSimulacionAscensor();
                    mainSimulacionAscensor.SimulacionAscensor(scanner); 
                    break;
                case 4:
                    MainAscensorPeso mainAscensorPeso = new MainAscensorPeso();
                    mainAscensorPeso.AscensorPeso(scanner); 
                    break;
                case 5:
                    MainSensorTemperatura mainSensorTemperatura = new MainSensorTemperatura();
                    mainSensorTemperatura.SensorTemperatura(scanner); 
                    break;
                case 6:
                    MainSensorTemperaturaAmbiente mainSensorTemperaturaAmbiente = new MainSensorTemperaturaAmbiente();
                    mainSensorTemperaturaAmbiente.SensorTemperaturaAmbiente(scanner); 
                    break;
                case 7:
                    MainAscensorSimulacionTempertura mainAscensorSimulacionTempertura = new MainAscensorSimulacionTempertura();
                    mainAscensorSimulacionTempertura.AscensorSimulacionTempertura(scanner); 
                    break;
                case 8:
                    TiendaMain tiendaMain = new TiendaMain();
                    TiendaMain.tiendatt(scanner); 
                    break;
                case 9:
                    MainAsistenteNutrisionista mainAsistenteNutrisionista = new MainAsistenteNutrisionista();
                    MainAsistenteNutrisionista.CalcularIMC(scanner); 
                    break;
                case 10:
                   MainCineAsistente mainCineAsistente = new MainCineAsistente();
                    MainCineAsistente.AsistenteCine(scanner);
                    break;
                case 11:
                    MainCampeonato mainCampeonato = new MainCampeonato();
                    MainCampeonato.Campeonato(scanner);
                    
                    break;
                case 12:
                    MainRestaurante mainRestaurante = new MainRestaurante();
                    MainRestaurante.Restaurante(scanner);
                    
                    break;
                case 13:
                    MainBanco mainBanco = new MainBanco();
                    MainBanco.Banco(scanner);
                    break;
                case 14:
                    MainTiendaOnline mainTiendaOnline = new MainTiendaOnline();
                    MainTiendaOnline.TiendaOnline(scanner);
                    break;
                case 15:
                    MainOficinaImpresora mainOficinaImpresora = new MainOficinaImpresora();
                    MainOficinaImpresora.OficinaImpresora(scanner);
                    break;
                case 16:
                    MainSimuladorDeViaje mainSimuladorDeViaje = new MainSimuladorDeViaje();
                    MainSimuladorDeViaje.SimuladorDeViaje(scanner);
                    break;
                case 17:
                    MainSimuladorCuentaRegresiva mainSimuladorCuentaRegresiva = new MainSimuladorCuentaRegresiva();
                    MainSimuladorCuentaRegresiva.SimuladorCuentaRegresiva(scanner);
                    break;
                case 18:
                    MainJuego mainJuego = new MainJuego();
                    MainJuego.Juego(scanner);
                    break;
                case 19:
                    MainRegistroBiblioteca mainRegistroBiblioteca = new MainRegistroBiblioteca();
                    MainRegistroBiblioteca.RegistroBiblioteca(scanner);
                    break;
                case 20:
                    MainComidasRapidasOrden mainComidasRapidasOrden = new MainComidasRapidasOrden();
                    MainComidasRapidasOrden.ComidasRapidasOrden(scanner);
                    break;
                case 21:
                    MainSensorTemperaturaApp mainSensorTemperaturaApp = new MainSensorTemperaturaApp();
                    MainSensorTemperaturaApp.SensorTemperaturaApp(scanner);
                    break;
                case 22:
                    MainExamen mainExamen = new MainExamen();
                    MainExamen.Examen(scanner);
                    break;
                case 23:
                    MainGestionTareas mainGestionTareas = new MainGestionTareas();
                    MainGestionTareas.GestionTareas(scanner);
                    break;
                case 24:
                    MainRegistroVentas mainRegistroVentas = new MainRegistroVentas();
                    MainRegistroVentas.RegistroVentas(scanner);
                    break;
                case 25:
                    MainRegistroParqueadero mainRegistroParqueadero = new MainRegistroParqueadero();
                    MainRegistroParqueadero.RegistroParqueadero(scanner);
                    break;
                case 26:
                    MainTiendaVirtual mainTiendaVirtual = new MainTiendaVirtual();
                    MainTiendaVirtual.TiendaVirtual(scanner);
                    break;
                case 27:
                    MainAgendaContactos mainAgendaContactos = new MainAgendaContactos();
                    MainAgendaContactos.AgendaContactos(scanner);
                    break;
                case 28:
                    MainSumaNumeros mainSumaNumeros = new MainSumaNumeros();
                    MainSumaNumeros.SumaNumeros(scanner);
                    break;
                case 29:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 29); 

        scanner.close();
    }
}

