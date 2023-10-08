package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class quickSortFile {

    // Aqui iniciamos el sorteo 
    public static void quickSort(int[] array, metricas metricales) {
        quickSort(array, metricales, 0, array.length - 1);
    }

    private static void quickSort(int[] array, metricas metricales, int inicial, int ultima) {
        if (inicial < ultima) {

            // Con esto buscamos al pivote una vez dada la división
            int pivote = division(array, metricales, inicial, ultima);

            // Usamos la recursividad para las dos sub particiones
            quickSort(array, metricales, inicial, pivote - 1);
            quickSort(array, metricales, pivote + 1, ultima);
        }
    }

    private static int division(int[] array, metricas metricales, int inicial, int ultima) {

        // Aqui escogemos al último elemento como pivote
        int pivot = array[ultima];

        // Aqui se guarda el índice más pequeño
        int i = (inicial - 1);

        for (int j = inicial; j <= ultima - 1; j++) {
            // Contabilizar comparaciones (￣▽￣)
            metricales.incrementComparacion(); 
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                // Contabilizar movimientos (b ᵔ▽ᵔ)b
                metricales.incrementMovimientos(); 
            }
        }
        int temp = array[i + 1];

        array[i + 1] = array[ultima];

        array[ultima] = temp;
        // Contabilizar movimientos (*¯︶¯*)
        metricales.incrementMovimientos(); 

        return i + 1;
    }
}