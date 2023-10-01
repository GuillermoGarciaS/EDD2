package Modulo_2.Actividad_7.Process;

import Modulo_2.Actividad_7.Ordenamiento.metricas;

public class selectionSortFile {

    public static void selectionSort(int[] array, metricas metricales) {

        //Para este algoritmo ocuparemos un duo de ciclos anidados para iterar sobre nuestra lista de datos (っ˘ω˘ς )
        for (int i = 0; i < array.length - 1; i++) {
            //Requeriremos seguir el paso de el valor minimo del int, por lo que implementamos lo siguiente (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
            int min = i;

            //Este segundo ciclo anidado nos ayudara a recorrer la lista que aun no ha sido trabajada (─‿‿─)
            for (int j = i + 1; j < array.length; j++) {
                metricales.incrementComparacion();

                //Aqui creamos un ciclo comparatívo para poder encontrar un elemento menor que el ya guardado en el valor minimo
                //Entonces, si el numero guardado en j es menor que "min", "min" se actualizará con el valor en j ＼(٥⁀▽⁀ )／
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            //intercambio de arrays usando la variable temporal como una "tercera mano" (b ᵔ▽ᵔ)b
            int tem = array[i];
            array[i] = array[min];
            array[min] = tem;
            metricales.incrementMovimientos();
        }

    }

}