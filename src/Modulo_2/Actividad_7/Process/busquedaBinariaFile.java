package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class busquedaBinariaFile {

    public static int busquedaBinaria(int[] array, int target, metricas metricales) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int mid = izquierda + (derecha - izquierda) / 2;

            // Incrementamos la comparasao ;3
            metricales.incrementComparacion();

            if (array[mid] == target) {

                return mid;
            } else if (array[mid] < target) {

                izquierda = mid + 1;
                metricales.incrementMovimientos();
            } else {

                derecha = mid - 1;
                metricales.incrementMovimientos();
            }
        }

        return -1;
    }
    
}