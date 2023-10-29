package Modulo_2.Actividad_9;

import Modulo_2.Actividad_9.Utils.Grafo;
import Modulo_2.Actividad_9.Process.SearchGraph;

public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();
        grafo.addVertice("A");
        grafo.addVertice("B");
        grafo.addVertice("C");
        grafo.addArista("A", "B", 1.0);
        grafo.addArista("B", "C", 2.0);


        Grafo.Vertice bfsResultado = SearchGraph.breadthFirstSearch(grafo, "A", "C");
        if (bfsResultado != null) {
            System.out.println("Resultado chido machido: " + bfsResultado.getNombre());
        } else {
            System.out.println("Que raro, no se encontro.");
        }

        Grafo.Vertice dfsResultado = SearchGraph.deepFirstSearch(grafo, "A", "C");
        if (dfsResultado != null) {
            System.out.println("Resultado de la busqueda profundisima: " + dfsResultado.getNombre());
        } else {
            System.out.println("No se encontro, que raro.");
        }
    }
}

