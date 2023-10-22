package Modulo_2.Actividad_9.Utils;

import java.util.ArrayList;
import java.util.HashMap;


public class Grafo {
    
    public Grafo() {

    }

    private final HashMap<Vertice, ArrayList<Arista>> vertices = new HashMap<>();

    public void addVertice(String nombre) {
        new Vertice(nombre);
        vertices.put(new Vertice(nombre), new ArrayList<Arista>());
    }

    public void addArista(String n1, String n2, double peso) {
        Vertice origen = buscarEnHashMap(n1);
        Vertice meta = buscarEnHashMap(n2);
        Arista arista = new Arista(origen, meta, peso);
        vertices.get(origen).add(arista);
    }

    public Vertice buscarEnHashMap(String nombre) {
        for (Vertice vertice : vertices.keySet()) {
            if (vertice.getNombre().equals(nombre)) {
                return vertice;
            }
        }
        addVertice(nombre);
        return buscarEnHashMap(nombre);
    }

    public ArrayList<Arista> getAdyacencias(Vertice vertice) {
        return vertices.get(vertice);
    }

    public class Vertice {
        private final String nombre;

        public Vertice(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public class Arista {
        private final Vertice n1;
        private final Vertice n2;
        private final double peso;

        public Arista(Vertice n1, Vertice n2, double peso) {
            this.n1 = n1;
            this.n2 = n2;
            this.peso = peso;
        }

        public Vertice getN1() {
            return n1;
        }

        public Vertice getN2() {
            return n2;
        }

        public double getPeso() {
            return peso;
        }
    }
}
