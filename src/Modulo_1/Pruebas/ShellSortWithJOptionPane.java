package Modulo_1.Pruebas;

import javax.swing.JOptionPane;

public class ShellSortWithJOptionPane {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de elementos:"));
        int[] numbers = new int[size];
        String[] names = new String[size];

        // Aqui se introducen nombres y numeros
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del elemento " + (i + 1) + ":"));
            names[i] = JOptionPane.showInputDialog("Ingresa el nombre " + (i + 1) + ":");
        }

        // Aqui se corre el codigo de acomodo
        shellSort(numbers, names);

        // Display sorted numbers and names
        StringBuilder sortedOutput = new StringBuilder("Datos arreglados :\n");
        for (int i = 0; i < size; i++) {
            sortedOutput.append(numbers[i]).append(": ").append(names[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, sortedOutput.toString());
    }

    // Shell Sort :3
    public static void shellSort(int[] arr, String[] names) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                String tempName = names[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    names[j] = names[j - gap];
                }
                arr[j] = temp;
                names[j] = tempName;
            }
        }
    }
}

