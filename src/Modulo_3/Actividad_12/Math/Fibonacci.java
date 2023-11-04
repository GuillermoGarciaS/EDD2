package Modulo_3.Actividad_12.Math;

public class Fibonacci {

    
    public static int getFibonacci(int num){

        // Caso base
        if(num == 0 || num == 1){

            return 1;
        }

        // Caso iterativo
        return getFibonacci(num - 1) + getFibonacci(num - 2);
    }

}