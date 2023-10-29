package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class insertionSortFile {

    public static void insertionSort(int[] array, metricas metricales) {

        for (int i = 1; i < array.length; i++) {
            int tem = array[i];
    
            // Inicializamos el índice del elemento que se está comparando con el elemento actual (⌒‿⌒)
            int j = i - 1;
    
            // Mientras el elemento actual sea mayor que el elemento que se está comparando ヽ(*・ω・)ﾉ
            while (j >= 0 && array[j] > tem) {
                //Aqui se agrega a la cuenta un numero de la comparación ヽ(*・ω・)ﾉ
                metricales.incrementComparacion();
    
                // Movemos el elemento actual a la derecha
                //Aqui dejamos otro para contar los movimientos (￣▽￣)
                array[j + 1] = array[j];
                j--;
            }
    
            // Insertamos el elemento que se está comparando en la posición correcta (๑˃ᴗ˂)ﻭ
            array[j + 1] = tem;
            metricales.incrementMovimientos();
        }
    
    }

}