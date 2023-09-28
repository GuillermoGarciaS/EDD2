package Modulo_2.Actividad_7.UI;

import Modulo_2.Actividad_7.Utils.arrayUtils;
import Modulo_2.Actividad_7.Process.bubbleSortFile;
import Modulo_2.Actividad_7.Process.insertionSortFile;
import Modulo_2.Actividad_7.Process.selectionSortFile;


public class Main {

    public static void main(String[] args) {

        int[] arrayAleatorio = arrayUtils.generarArrayAleatorio(200, 1, 500); //(ﾉ´ヮ`)ﾉ*: ･ﾟTamaño del array: 200, Rango de numeros del array: 1-500 

        System.out.println("Aqui está el array original así sin moverle nada wn: ");
        arrayUtils.imprimirArray(arrayAleatorio);

        bubbleSortFile.bubbleSort(arrayAleatorio);
        insertionSortFile.insertionSort(arrayAleatorio);
        selectionSortFile.selectionSort(arrayAleatorio);

        System.out.println("\niralo aqui todo acomodadito ay pero que bonito");
        arrayUtils.imprimirArray(arrayAleatorio);
    }
}
