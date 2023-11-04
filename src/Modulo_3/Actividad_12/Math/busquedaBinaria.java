package Modulo_3.Actividad_12.Math;

public class busquedaBinaria {

    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

        int pos = busqueda(arreglo, 10, 0, arreglo.length - 1);

        if (pos == -1) {

            System.out.println("No se encontró el número");

        } else {

            System.out.println("Aquí está tu número en la versión iterativa: " + pos);

        }

        System.out.println("Ahora lo haremos de manera recursiva");

        int pos2 = busquedaRecursivaBinaria(arreglo, 10, 0, arreglo.length - 1);

        if (pos2 == -1) {

            System.out.println("No se encontró el número");

        } else {

            System.out.println("Aquí está tu número en la versión recursiva: " + pos2);

        }

    }

    public static int busqueda(int[] arreglo, int dato, int inicio, int fin) {

        while (inicio <= fin) {

            int mitad = (inicio + fin) / 2;

            if (arreglo[mitad] == dato) {

                return arreglo[mitad];

            } else if (arreglo[mitad] < dato) {

                inicio = mitad + 1;

            } else {

                fin = mitad - 1;

            }

        }

        return -1;
    }

    public static int busquedaRecursivaBinaria(int[] arreglo, int dato, int inicio, int fin) {

        if (inicio <= fin) {

            int mitad = (inicio + fin) / 2;

            if (dato == arreglo[mitad]) {

                return arreglo[mitad];

            } else if (dato > arreglo[mitad]) {

                return busquedaRecursivaBinaria(arreglo, dato, mitad + 1, fin);

            } else {

                return busquedaRecursivaBinaria(arreglo, dato, inicio, mitad - 1);
                
            }

        }

        return -1;
    }

}