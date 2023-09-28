package Modulo_2.Actividad_7.Process;

public class bubbleSortFile {

    public static void bubbleSort(int[] array) {
         
        int n = array.length;
        boolean intercambiado;

        do {
            //Lo inicializamos en un estado falso ya que al principio no hay nada que intercambiar aun ( ˙꒳​˙ )
            intercambiado = false;

            for (int i = 1; i < n; i++) {
                
                //La siguiente condicion checa si el elemento dado en el array es mayor al elemento siguiente, ya que si es verdad entonces tienen que intercambiarse <(￣︶￣)>
                if (array[i - 1] > array[i]) {

                    //intercambio de arrays usando la variable temporal como una "tercera mano" (b ᵔ▽ᵔ)b
                    int tem = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tem;

                    //Aqui corroboramos que ya dado un intercambio, este fue exitoso en al menos una ocación (*¯︶¯*)
                    intercambiado = true;
                }
            }
            //Aqui reducimos el campo de trabajo por uno, ya que el elemento más grande ya habra "burbujeado" su posición hasta arriba 。.:☆*:･'(*⌒―⌒*)))
            n--;
        } while (intercambiado);
        
    }

}