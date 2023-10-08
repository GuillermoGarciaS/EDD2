package Modulo_2.Pruebas;

public class Mergeado {

    public static void main(String[] args) {
        
        int[] array = {25, 20 ,30, 10 ,5, 15};

        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if(length <= 1) return;

        int mitad = length / 2;
        int[] arrayIzquierdo = new int[mitad];
        int[] arrayDerecho = new int[length - mitad];

        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if (i < mitad) {
                arrayIzquierdo[i] = array[i];
            }
            else {
                arrayDerecho[j] = array[i];
                j++;
            }
        }
        mergeSort(arrayIzquierdo);
        mergeSort(arrayDerecho);
        merge(arrayIzquierdo, arrayDerecho, array);
    }

    private static void merge(int[] arrayIzquierdo, int [] arrayDerecho, int[] array) {

        int tamañoIzquierdo = array.length / 2;
        int tamañoDerecho = array.length - tamañoIzquierdo;
        int i = 0, l = 0, d = 0;

        while(i < tamañoIzquierdo && d < tamañoDerecho) {
            if(arrayIzquierdo[l] < arrayDerecho[d]) {
                array[i] = arrayIzquierdo[l];
                i++;
                l++;
            }
            else {
                array[i] = arrayDerecho[d];
                i++;
                d++;
            }
        }
        while (l < tamañoIzquierdo) {
            array[i] = arrayIzquierdo[l];
            i++;
            l++;
        }
        while(d < tamañoDerecho) {
            array[i] = arrayDerecho[d];
            i++;
            d++;
        }
    }
    
}
