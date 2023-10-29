package Modulo_1.Pruebas;
import javax.swing.JOptionPane;

public class SelectionSort {

    public static void main(String[] args) {
        // Prompt the user for input using an input dialog
        String input = JOptionPane.showInputDialog("Enter numbers separated by spaces:");

        // Check if the user clicked Cancel or closed the dialog
        if (input != null) {
            // Split the input string into an array of integers
            String[] inputArray = input.split(" ");
            int[] array = new int[inputArray.length];

            for (int i = 0; i < inputArray.length; i++) {
                try {
                    array[i] = Integer.parseInt(inputArray[i]);
                } catch (NumberFormatException e) {
                    // Handle invalid input (non-integer values)
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter numbers separated by spaces.");
                    return; // Exit the program
                }
            }

            // Call the selectionSort method
            selectionSort(array);

            // Display the sorted array in a message dialog
            StringBuilder sortedArray = new StringBuilder();
            for (int i : array) {
                sortedArray.append(i).append(" ");
            }

            JOptionPane.showMessageDialog(null, "Sorted Array: " + sortedArray.toString());
        } else {
            // The user clicked Cancel or closed the dialog
            JOptionPane.showMessageDialog(null, "You canceled the operation.");
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}