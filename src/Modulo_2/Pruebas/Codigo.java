package Modulo_2.Pruebas;

import java.util.Random;

public class Codigo {

    public static void main(String[] args) {

        //Como funciona este codigo
        //1.- Primero generaremos un array de numeros aleatorios, seran 200 y tendran un valor minimo y máximo establecido
        //2.- Despues se manda a llamar a los algoritmos ya programados para que lo hagan
        //3.- Al final este se imprimira, dentro de los for uso unos comandos para que se impriman de manera bonita, pero si deseas imprimirlos uno por uno,
        //Usa el siguiente codigo

        /*
          public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
         */

        //Recomendación de prueba
        //Usa los comentarios en dos de los 3 metodos si es que solo quieres usar uno de estos
        //Si deseas cambiar tanto la longitud, así como el minimo o el máximo hazlo en la linea de codigo que viene debajo del comentario que dice "Generamos un array aleatorio"

        //Generamos un array aleatorio ٩(◕‿◕｡)۶
        int[] arrayAleatorio = generarArrayAleatorio(200, 1, 500); //(ﾉ´ヮ`)ﾉ*: ･ﾟTamaño del array: 200, Rango de numeros del array: 1-500 

        System.out.println("Aqui está el array original así sin moverle nada wn: ");
       imprimirArray(arrayAleatorio);

       bubbleSort(arrayAleatorio);

       insertionSort(arrayAleatorio);

       selectionSort(arrayAleatorio);

       System.out.println("\niralo aqui todo acomodadito ay pero que bonito");
       imprimirArray(arrayAleatorio);
    }

    public static int[] generarArrayAleatorio(int longitud, int min, int max) {
        int[] arrayAleatorio = new int[longitud];
        Random random = new Random();

        //Dentro de este for, iremos generando numeros aleatorios hasta que todas las condiciones esten completas ╰(▔∀▔)╯
        for (int i = 0; i < longitud; i++) {
            arrayAleatorio[i] = random.nextInt(max - min + 1) + min;
        }

        return arrayAleatorio;
    }

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

    public static void selectionSort(int[] array) {

        //Para este algoritmo ocuparemos un duo de ciclos anidados para iterar sobre nuestra lista de datos (っ˘ω˘ς )
        for (int i = 0; i < array.length - 1; i++) {
            //Requeriremos seguir el paso de el valor minimo del int, por lo que implementamos lo siguiente (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
            int min = i;

            //Este segundo ciclo anidado nos ayudara a recorrer la lista que aun no ha sido trabajada (─‿‿─)
            for (int j = i + 1; j < array.length; j++) {

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
        }
    }

    
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

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            //Para imprimir una coma por cada nwumerito y que sea vea todo kawaii y bonito ☆ ～('▽^人)
            if (i < array.length - 1) {
                System.out.print(", ");
            }

            //Imprimimos la lista de datitos en filas de 10 (っ˘ω˘ς )
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        
    }
    
}

//Y con eso doy concluido mi codigo (￣ω￣;)