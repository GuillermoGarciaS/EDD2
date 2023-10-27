package Modulo_3.Actividad_11.CLI;
import java.util.InputMismatchException;
import java.util.Scanner;

import Modulo_3.Actividad_11.Process.Opcciones;

public class UI {

    public static void menu() {

        Scanner scannerUI = new Scanner(System.in);

        int opcion;

        // Menu de opcciones //

        cuadroMenu.CuadroMenu();

        try {

            opcion = scannerUI.nextInt();

            switch (opcion) {
                case 1:

                    Opcciones.vacio();
                    break;
                case 2:

                    Opcciones.tamaño();
                    break;
                case 3:

                    Opcciones.insertar();
                    break;
                case 4:

                    Opcciones.busqueda();
                    break;
                case 5:

                    Opcciones.borrar();
                    break;

                case 6: 

                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;


                default:

                    System.out.println("\n\n                                                                                       Opción no válida, intente nuevamente");
                    UI.menu();
            }

        scannerUI.close();

        } catch (InputMismatchException e) {

            System.out.println("\n\n                                                                                     Opción no válida, intente nuevamente");
            scannerUI.next();
            UI.menu();

        } finally {

            scannerUI.close();

        }

    }
    
}