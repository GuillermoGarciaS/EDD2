package Modulo_3.Actividad_13;

import java.util.Arrays;

public class Mediana {

    public static double calcularMediana(int[] num) {

        Arrays.sort(num);

        int tamaño = num.length;

        if (tamaño % 2 == 0) {

            int medio1 = num [tamaño / 2 - 1];
            int medio2 = num[tamaño / 2];

            return (double) (medio1 + medio2) / 2;

        } else {

            return (double) num[tamaño / 2];

        }

    }

}