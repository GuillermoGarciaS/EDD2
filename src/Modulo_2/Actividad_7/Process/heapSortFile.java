package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class heapSortFile {

    public static void heapSort(int[] array, metricas metricales) {
        int n = array.length;

        // Construimos un maximo de el array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, metricales, n, i);
        }

        // Sacamos los elementos uno por uno
        for (int i = n - 1; i > 0; i--) {
            // Intercambio time :3
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Incrementamos los movimientos 
            metricales.incrementMovimientos();

            // Mandamos a llamar al heapify para continuar
            heapify(array, metricales, i, 0);
        }
    }

    private static void heapify(int[] array, metricas metricales, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // Aqui comparamos con raices
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            metricales.incrementComparacion();
            largest = leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            metricales.incrementComparacion();
            largest = rightChild;
        }

        // Y aqui cambiaremos al heapify recursive si el elemento más largo no esta en la raiz
        if (largest != rootIndex) {
            int swap = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = swap;

            // Increment movements
            metricales.incrementMovimientos();

            // heapify de nuevo nwn
            heapify(array, metricales, heapSize, largest);
        }
    }
    
}
