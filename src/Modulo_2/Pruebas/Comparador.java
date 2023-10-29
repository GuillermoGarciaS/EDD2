package Modulo_2.Pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Comparador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al comparador! Por favor, ingresa la opción que deseas usar:");
        System.out.println("1.- Ordenar números \n2.- Comparar numeros");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Deseas que se impriman de manera aleatoria o establecer los valores tu mismo?");
                System.out.println("1.- Aleatoria\n2.- Establecer yo mismo");
                Scanner scanner2 = new Scanner(System.in);
                int opcion2 = scanner2.nextInt();

                switch (opcion2) {
                    case 1:
                    // caso aleatorio
                    break;
                    case 2:
                    ordenarNumeros();
                    break;
                    default:
                    System.out.println("Opcion no valida");
                    break;
                }

                break;
            case 2:
            compararNumeros();
            default:
                System.out.println("Opción no válida");
                break;
        }
        scanner.close();
    }

    public static void compararNumeros() {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        System.out.println("Ingresa la cantidad de números que deseas comparar:");
        int cantidad = scanner.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingresa el número " + i + ":");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }

        Collections.sort(numeros, new Comparator<Double>() {
            @Override
            public int compare(Double num1, Double num2) {
                return Double.compare(num1, num2);
            }
        });

        System.out.println("Números ordenados de menor a mayor:");
        for (Double numero : numeros) {
            System.out.println(numero + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void ordenarNumeros() {
        Scanner sc=new Scanner(System.in);
        
        // Creamos aqui una lista 
        System.out.println("¿Que tan larga quieres que sea la lista?");
        int longitud = sc.nextInt();

        System.out.println("¿Cuál sera el límite máximo para los numeros aleatorios?");
        int limite = sc.nextInt();
        
        Integer[] numeros = new Integer[longitud];

        // Generaremos aqui los numeros aleatorios con un limite máximo de 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * limite) + 1;
        }

        // Convertimos el vector a una lista
        List<Integer> lista = Arrays.asList(numeros);
        Collections.sort(lista);
        lista.forEach(v -> System.out.println(v + " "));

        sc.close();
    }
}