package Modulo_2.Actividad_7.Utils;

import java.util.Random;

public class arrayUtils {
        public static int[] generarArrayAleatorio(int longitud, int min, int max) {
        int[] arrayAleatorio = new int[longitud];
        Random random = new Random();

        //Dentro de este for, iremos generando numeros aleatorios hasta que todas las condiciones esten completas ╰(▔∀▔)╯
        for (int i = 0; i < longitud; i++) {
            arrayAleatorio[i] = random.nextInt(max - min + 1) + min;
        }

        return arrayAleatorio;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            //Para imprimir una coma por cada nwumerito y que sea vea todo kawaii y bonito ☆ ～('▽^人)
            if (i < array.length - 1) {
                System.out.print(", ");
            }

            //Imprimimos la lista de datitos en filas de 10 (っ˘ω˘ς )
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        
    }
}
