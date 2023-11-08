package Modulo_3.Actividad_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("¿Que tan grande vas a desear que sea tu arreglo?");
        Scanner scanner = new Scanner(System.in);
        int tamaño = scanner.nextInt();
        int [] num = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {

            System.out.println("Inserta el digito " + (i + 1));
            num [i] = scanner.nextInt();

        }

        scanner.close();

        for (int numm : num) {
            
            System.out.print(numm + " | ");

        }

        double mediana = Mediana.calcularMediana(num);
        System.out.println("\nLa mediana del arreglo es : " + mediana);

    }
    
}