package Modulo_2.Actividad_9;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class prim2 {

    public static void main(String[] args) {

        int numeroDeVertices = 0;

        String inputDeVertices = JOptionPane.showInputDialog("¿Cuantos vertices tiene tu grafo?");

        try {
            numeroDeVertices = Integer.parseInt(inputDeVertices);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dato invalido, por favor ingrese un número válido de vértices");
            return; // Salir del programa si la entrada es inválida
        }

        List<Borde> bordes = new ArrayList<>();

        for (int i = 1; i < numeroDeVertices; i++) {
            for (int j = i + 1; j <= numeroDeVertices; j++) {
                String pesoDelInput = JOptionPane.showInputDialog("Inserta el peso por borde (" + i + " - " + j + "):");

                try {
                    int peso = Integer.parseInt(pesoDelInput);
                    bordes.add(new Borde(i, j, peso));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Input invalido, por favor ingresa un número válido");
                }
            }
        }

        System.out.println("Grafo: ");
        for (Borde borde : bordes) {
            System.out.println("Vertice inicial: " + borde.verticeInicial + "\nVertice Final: " + borde.verticeFinal + "\n" + //
                    "Peso: " + borde.peso);

        }
    }
}

class Borde {

    int verticeInicial, verticeFinal, peso;

    Borde(int verticeInicial, int verticeFinal, int peso) {

        this.verticeInicial = verticeInicial;
        this.verticeFinal = verticeFinal;
        this.peso = peso;
    }
}

