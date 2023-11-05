package Modulo_3.Actividad_12.Math;

public class Factorial {

    public static int getFactorialRecursivo(int num) {

        // Caso base
        if (num == 1) {
            
            return 1;
        }

        // Caso Recursivo
        return num * getFactorialRecursivo(num - 1);

    }

    public static int getFactorialIterativo(int num) {

        int resultado = 1;

        while (num > 1) {

            resultado *= num;

            num -= 1;

        }

        return resultado;

    }

    
}