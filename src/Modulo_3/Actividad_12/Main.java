package Modulo_3.Actividad_12;

import Modulo_3.Actividad_12.Math.Factorial;
import Modulo_3.Actividad_12.Math.Fibonacci;
import Modulo_3.Actividad_12.Math.busquedaBinaria;

public class Main {


    public static void main(String[] args) {
        
        int num = 10;
        System.out.println("El numero: " + num);
        System.out.println("Iterativos");
        System.out.println("El numero en Fibonacci: " + Fibonacci.getFibonacciIterativo(num, num, num, num));
        System.out.println("El numero exponencial: " + Factorial.getFactorialIterativo(num));
        
        System.out.println("Recursivos");
        System.out.println("El numero en Fibonacci: " + Fibonacci.getFibonacciRecursivo(num));
        System.out.println("El numero exponencial: " + Factorial.getFactorialRecursivo(num));

        busquedaBinaria.main(args);

    }
    
}