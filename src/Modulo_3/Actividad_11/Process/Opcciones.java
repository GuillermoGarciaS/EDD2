package Modulo_3.Actividad_11.Process;

import java.util.HashMap;
import java.util.Scanner;

import Modulo_3.Actividad_11.CLI.UI;

public class Opcciones<E> {


    static HashMap<String, Integer> empleados = new HashMap<>(21);


    // Sintaxis primarias //

    // Primera sintaxis
        // isEmpty()
    public static void vacio () {

        if (empleados.isEmpty()) {
            
            System.out.println("\n\n");
            System.out.println("\n                                                                                    Aun no hay ningun empleado registrado");

        } else {

            System.out.println("\n\n");
            System.out.println("                                                                                          Ya se cuenta con empleados");

        }

        UI.menu();

    }

    // Segunda sintaxis
        // Size()
     public static void tamaño () {

        if (empleados.isEmpty()) {
            
            System.out.println("\n\n\n                                                                                    Aun no hay ningun empleado registrado");

        } else {

            System.out.println("Hay un total de: " + empleados.size() + " empleados registrados");

        }

        UI.menu();

    }

    // Tercera sintaxis
        // add(key, value)
    public static void insertar() {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Ingresa el salario");


        while (!scanner.hasNextInt()) {

            System.out.println("Ese no es un monto válido, favor de ingresar un monto válido");
            scanner.next();

        }

              int salario = scanner.nextInt();

        System.out.println("Ingresa el nombre del empleado al cual se asignara dicho monto");
        String nombre = scanner2.nextLine();

        empleados.put(nombre, salario);

        System.out.println("\n\n\n\n                                                                                          Datos registrados con exito!\n");

        

        UI.menu();

        scanner.close();
        scanner2.close();

    }

    // Cuarta sintaxis
        // getByKey(key)
    public static void busqueda () {

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Ingresa el nombre del empleado para conocer su salario\n");
        String nombre =  scanner3.nextLine();

        if (empleados.containsKey(nombre)) {

            int salario = empleados.get(nombre);
            System.out.println("El empleado " + nombre + " cuenta con un salario de " + salario);

        } else {

            System.out.println("\n                                                                           El empleado " + nombre + " no se encuentra registrado en el sistema");

        }


        UI.menu();

        scanner3.close();

    }

    // Sintaxis extras //
        
    public static void borrar () {

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Ingresa el nombre del empleado a borrar de la lista");
        String nombre =  scanner4.nextLine();

        if (empleados.containsKey(nombre)) {

            int salario = empleados.get(nombre);
            empleados.remove(nombre, salario);
            System.out.println("\n\n\n\n                                                                                        Empleado eliminado exitosamente");

        } else {

            System.out.println("\nEl empleado " + nombre + " no se encuentra registrado en el sistema");

        }

        UI.menu();

        scanner4.close();
    }


}