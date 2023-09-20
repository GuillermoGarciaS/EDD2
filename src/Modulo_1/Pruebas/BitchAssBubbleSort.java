package Modulo_1.Pruebas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BitchAssBubbleSort {
    
    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        arreglo = new int[nElementos]; //Asignamos el n de elementos al arreglo

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Metodo de burbuja
        for (int i = 0; i < nElementos; i++) {
            //restaremos 1 a nElementos dado que originalmente daría n cantidad de vueltas, más la ultima no es realmente necesaría, así que nos ayuda a omitir procesos
            for (int j = 0; j < (nElementos-1); j++) {
                if(arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

        //Mostrando el arreglo ordenado crecientemente
        System.out.println("\nArreglo ordenado en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("\narreglo ordenado de forma decreciente");

        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");

        entrada.close();
    }
}
