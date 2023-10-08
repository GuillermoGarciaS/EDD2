package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class mergeSortFile {

    // Función principal de Merge Sort que recibe el arreglo y las métricas
    public static void mergeSort(int[] array, metricas metricales) {
        mergeSort(array, metricales, 0, array.length - 1);
    }

    // Función recursiva de Merge Sort (´⌣`ʃƪ)
    private static void mergeSort(int[] array, metricas metricales, int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (inicio + fin) / 2;

            // Ordenar la mitad izquierda (⁀‿⁀)
            mergeSort(array, metricales, inicio, mitad); 
            // Ordenar la mitad derecha (＾▽＾)
            mergeSort(array, metricales, mitad + 1, fin); 
            // Fusionar las dos mitades (•‿•)
            merge(array, metricales, inicio, mitad, fin); 
        }
    }

    // Función para fusionar dos subarreglos ordenados ♡ ～('▽^人)
    private static void merge(int[] array, metricas metricales, int inicio, int mitad, int fin) {
        int n1 = mitad - inicio + 1;
        int n2 = fin - mitad;

        // Crear arreglos temporales para las mitades izquierda y derecha (｡♥‿♥｡)
        int[] izquierdo = new int[n1];
        int[] derecho = new int[n2];

        // Copiar datos a los arreglos temporales (◕‿◕)
        for (int i = 0; i < n1; i++) {
            izquierdo[i] = array[inicio + i];
            // Contabilizar movimientos (つ✧ω✧)つ
            metricales.incrementMovimientos(); 
        }
        for (int j = 0; j < n2; j++) {
            derecho[j] = array[mitad + 1 + j];
            // Contabilizar movimientos (つ✧ω✧)つ
            metricales.incrementMovimientos(); 
        }

        // Fusionar los arreglos temporales en el arreglo original (＾▽＾)
        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            // Contabilizar comparaciones (◕‿◕✿)
            metricales.incrementComparacion(); 
            if (izquierdo[i] <= derecho[j]) {
                array[k] = izquierdo[i];
                i++;
            } else {
                array[k] = derecho[j];
                j++;
            }
            // Contabilizar movimientos (つ✧ω✧)つ
            metricales.incrementMovimientos(); 
            k++;
        }

        // Copiar elementos restantes de izquierdo y derecho (｡♥‿♥｡)
        while (i < n1) {
            array[k] = izquierdo[i];
            i++;
            k++;
            // Contabilizar movimientos (つ✧ω✧)つ
            metricales.incrementMovimientos(); 
        }
        while (j < n2) {
            array[k] = derecho[j];
            j++;
            k++;
            metricales.incrementMovimientos(); // Contabilizar movimientos (つ✧ω✧)つ
        }
    }
}
