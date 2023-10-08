package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class shellSortFile {

    public static void shellSort(int[] array, metricas metricales) {

        // La idea del algoritmo Shell Sort es dividir el arreglo en grupos más pequeños,
        // y luego aplicar el algoritmo de inserción en cada grupo. (⁀‿⁀)
        
        int n = array.length;
        int intervalo = 1;

        // Calculamos el intervalo inicial de manera dinámica (｡♥‿♥｡)
        while (intervalo < n / 3) {
            intervalo = intervalo * 3 + 1;
        }

        // Comenzamos con el intervalo más grande y lo vamos reduciendo
        while (intervalo > 0) {

            // Aplicamos el algoritmo de inserción en cada grupo de elementos
            for (int i = intervalo; i < n; i++) {
                int temp = array[i];
                int j = i;

                // Realizamos un desplazamiento en el grupo mientras sea necesario
                while (j >= intervalo && array[j - intervalo] > temp) {
                    array[j] = array[j - intervalo];
                    j -= intervalo;
                    // Contabilizamos las comparaciones en este ciclo (◕‿◕✿)
                    metricales.incrementComparacion();
                }

                array[j] = temp;
                // Contabilizamos los movimientos (つ✧ω✧)つ
                metricales.incrementMovimientos();
            }

            // Reducimos el intervalo para el siguiente paso
            intervalo = (intervalo - 1) / 3;
        }
    }

}