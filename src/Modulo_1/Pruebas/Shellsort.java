package Modulo_1.Pruebas;

import javax.swing.JOptionPane;

public class Shellsort {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieres wey:"));
        int[] numeros = new int[size];

        // Input numbers
        for (int i = 0; i < size; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero del dato " + (i + 1) + ":"));
        }

        // Perform Shell Sort
        shellSort(numeros);

        // Display sorted numbers
        StringBuilder sortedOutput = new StringBuilder("Acomodaditos así bien bonitos :3:\n");
        for (int i = 0; i < size; i++) {
            sortedOutput.append(numeros[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, sortedOutput.toString());
    }

    // Shell Sort implementation
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}
