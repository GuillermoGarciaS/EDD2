package Modulo_2.Actividad_7.UI;

import Modulo_2.Actividad_7.Utils.arrayUtils;
import Modulo_2.Actividad_7.Process.bubbleSortFile;
import Modulo_2.Actividad_7.Process.insertionSortFile;
import Modulo_2.Actividad_7.Process.selectionSortFile;
import Modulo_2.Actividad_7.Process.shellSortFile;
import Modulo_2.Actividad_7.Ordenamiento.metricas;


public class Main {

    public static void main(String[] args) {

        int[] arrayAleatorio = arrayUtils.generarArrayAleatorio(200, 1, 500);

        System.out.println("Aqui está el array original así sin moverle nada wn: ");
        arrayUtils.imprimirArray(arrayAleatorio);

        metricas MetricaBubbleSort = new metricas();
        bubbleSortFile.bubbleSort(arrayAleatorio.clone(), MetricaBubbleSort);
        System.out.println("\nComparaciones del sorteo de burbja: " + MetricaBubbleSort.getComparacion());
        System.out.println("Movimientos totales del metodo de burbuja: " + MetricaBubbleSort.getMovimientos());

        metricas MetricaSelectionSort = new metricas();
        selectionSortFile.selectionSort(arrayAleatorio.clone(), MetricaSelectionSort);
        System.out.println("\nComparaciones del sorteo de seleccion: " + MetricaSelectionSort.getComparacion());
        System.out.println("Movimientos totales del metodo de seleccion: " + MetricaSelectionSort.getMovimientos());

        metricas MetricasInsertionSort = new metricas();
        insertionSortFile.insertionSort(arrayAleatorio.clone(), MetricasInsertionSort);
        System.out.println("\nComparaciones del sorteo de insercion: " + MetricasInsertionSort.getComparacion());
        System.out.println("Movimientos totales del metodo de insercion: " + MetricasInsertionSort.getMovimientos());

        metricas MetricasShellSort = new metricas();
        shellSortFile.shellSort(arrayAleatorio.clone(), MetricasShellSort);
        System.out.println("\nComparaciones del sorteo de shell: " + MetricasShellSort.getComparacion());
        System.out.println("Movimientos totales del metodo de shell: " + MetricasShellSort.getMovimientos());

        System.out.println("\niralo aqui todo acomodadito ay pero que bonito");
        arrayUtils.imprimirArray(arrayAleatorio);
    }
}