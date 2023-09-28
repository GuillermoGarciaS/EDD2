package Modulo_2.Actividad_7.Process;

public class insertionSortFile {

    public static void insertionSort(int[] array) {
         
        //
        for (int i = 1; i < array.length; i++) {
            int tem = array[i];
            //La siguiente linea se encarga de asegurarnos que estamos comparando j con cualquier cosa que este detras de este (⌒‿⌒)
            int j = i - 1;

            while (j >= 0 && array[j] > tem) {
                //Esta linea se encarga de mover el elemento a la derecha de nuestra actual posición ヽ(*・ω・)ﾉ
                array[j + 1] = array[j];
                j--;
            }
            //Y para finalizar, aqui insertamos el valor que esta en la variable temporal dentro del hueco que se crea (๑˃ᴗ˂)ﻭ
            array[j + 1] = tem;
        }
        
    }

}