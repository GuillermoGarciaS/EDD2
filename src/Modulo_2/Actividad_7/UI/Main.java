package Modulo_2.Actividad_7.UI;

import Modulo_2.Actividad_7.Utils.arrayUtils;
import Modulo_2.Actividad_7.Process.bubbleSortFile;
import Modulo_2.Actividad_7.Process.busquedaBinariaFile;
import Modulo_2.Actividad_7.Process.busquedaSecuencialFile;
import Modulo_2.Actividad_7.Process.insertionSortFile;
import Modulo_2.Actividad_7.Process.mergeSortFile;
import Modulo_2.Actividad_7.Process.quickSortFile;
import Modulo_2.Actividad_7.Process.selectionSortFile;
import Modulo_2.Actividad_7.Process.shellSortFile;
import Modulo_2.Actividad_7.Process.heapSortFile;
import Modulo_2.Actividad_7.Ordenamiento.metricas;


public class Main {

    public static void main(String[] args) {

        int[] arrayAleatorio = arrayUtils.generarArrayAleatorio(2000, 1, 5000);

        //Por el momento esto quedara así para solo obtener datos
        /* 
        System.out.println("Aqui está el array original así sin moverle nada wn: ");
        arrayUtils.imprimirArray(arrayAleatorio);
        */

        metricas MetricaBubbleSort = new metricas();
        bubbleSortFile.bubbleSort(arrayAleatorio.clone(), MetricaBubbleSort);
        System.out.println("\nEl sorteo de burbuja tuvo " + MetricaBubbleSort.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método de burbuja: " + MetricaBubbleSort.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");

        System.out.print("------------------------------------------------------------------------------");
        
        metricas MetricaSelectionSort = new metricas();
        selectionSortFile.selectionSort(arrayAleatorio.clone(), MetricaSelectionSort);
        System.out.println("\nEl sorteo de selección tuvo " + MetricaSelectionSort.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método de selección: " + MetricaSelectionSort.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");
        
        System.out.print("------------------------------------------------------------------------------");

        metricas MetricasInsertionSort = new metricas();
        insertionSortFile.insertionSort(arrayAleatorio.clone(), MetricasInsertionSort);
        System.out.println("\nEl sorteo de inserción tuvo " + MetricasInsertionSort.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método de inserción: " + MetricasInsertionSort.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");
        
        System.out.print("------------------------------------------------------------------------------");

        metricas MetricasShellSort = new metricas();
        shellSortFile.shellSort(arrayAleatorio.clone(), MetricasShellSort);
        System.out.println("\nEl sorteo de Shell tuvo " + MetricasShellSort.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método de Shell: " + MetricasShellSort.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");
        
        System.out.print("------------------------------------------------------------------------------");

        metricas MetricasmergeSort = new metricas();
        mergeSortFile.mergeSort(arrayAleatorio.clone(), MetricasmergeSort);
        System.out.println("\nEl sorteo de Merge tuvo " + MetricasmergeSort.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método de Merge: " + MetricasmergeSort.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");
        
        System.out.print("------------------------------------------------------------------------------");

        metricas MetricasQuickSort = new metricas();
        quickSortFile.quickSort(arrayAleatorio.clone(), MetricasQuickSort);
        System.out.println("\nEl sorteo de quick tuvo " + MetricasQuickSort.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método quick: " + MetricasQuickSort.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");

        System.out.print("------------------------------------------------------------------------------");

        metricas MetricasHeapSort = new metricas();
        heapSortFile.heapSort(arrayAleatorio.clone(), MetricasHeapSort);
        System.out.println("\nEl sorteo de heap tuvo " + MetricasHeapSort.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método heap " + MetricasHeapSort.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");

        System.out.print("------------------------------------------------------------------------------");

        metricas MetricasBusquedaBinaria = new metricas();
        busquedaBinariaFile.busquedaBinaria(arrayAleatorio.clone(), 0, MetricasBusquedaBinaria);
        System.out.println("\nEl sorteo binario tuvo " + MetricasBusquedaBinaria.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método binario " + MetricasBusquedaBinaria.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");

        System.out.print("------------------------------------------------------------------------------");

        metricas MetricasBusquedaSecuencial = new metricas();
        busquedaSecuencialFile.busquedaSecuencial(arrayAleatorio.clone(), 0, MetricasBusquedaSecuencial);
        System.out.println("\nEl sorteo secuencial tuvo " + MetricasBusquedaSecuencial.getComparacion() + " comparaciones (≧◡≦)");
        System.out.println("Movimientos totales del método secuencial " + MetricasBusquedaSecuencial.getMovimientos() + " movimientos (´∩｡• ᵕ •｡∩`)");

        System.out.print("------------------------------------------------------------------------------");


        //Por el momento esto quedara así para solo obtener datos
        /* 
        System.out.println("\niralo aqui todo acomodadito ay pero que bonito");
        arrayUtils.imprimirArray(arrayAleatorio);
        */
    }
}