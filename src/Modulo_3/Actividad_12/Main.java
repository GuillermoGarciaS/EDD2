package Modulo_3.Actividad_12;

import Modulo_3.Actividad_12.Math.Factorial;
import Modulo_3.Actividad_12.Math.Fibonacci;
import Modulo_3.Actividad_12.Math.busquedaBinaria;

public class Main {


    public static void main(String[] args) {
        
        int num = 10;
        System.out.println("El numero: " + num);
        System.out.println("El numero en Fibonacci: " + Fibonacci.getFibonacci(num));
        System.out.println("El numero exponencial: " + Factorial.getFactorialRecursivo(num));
        System.out.println("El numero exponencial: " + Factorial.getFactorialIterativo(num));

        busquedaBinaria.main(args);

    }
    
}
