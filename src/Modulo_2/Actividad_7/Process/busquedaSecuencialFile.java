package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class busquedaSecuencialFile {

    public static int busquedaSecuencial(int[] array, int target, metricas metricales) {
        for (int i = 0; i < array.length; i++) {
            // Incrementamos la comparación
            metricales.incrementComparacion();

            if (array[i] == target) {
                return i; // Se encontró el elemento
            }

            // Incrementamos los movimientos
            metricales.incrementMovimientos();
        }

        return -1; // El elemento no se encontró en el arreglo
    }

}
