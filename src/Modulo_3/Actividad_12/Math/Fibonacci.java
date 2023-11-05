package Modulo_3.Actividad_12.Math;

public class Fibonacci {

    
    public static int getFibonacciRecursivo(int num){

        // Caso base
        if(num == 0 || num == 1){

            return 1;
        }

        // Caso iterativo
        return getFibonacciRecursivo(num - 1) + getFibonacciRecursivo(num - 2);
    }

    public static int getFibonacciIterativo (int num, int a, int b, int c) {

        a = 1;
        b = 1;
        c = 0;

        for (int i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return a;

    }

}