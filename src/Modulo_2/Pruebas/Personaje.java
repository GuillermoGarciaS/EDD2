package Modulo_2.Pruebas;

import java.util.LinkedList;
import java.util.Queue;

public class Personaje {
    private String nombre;
    private int ataque;

    public Personaje(String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return "Personaje: " + nombre + "| Ataque: " + ataque;
    }
}

class imprimirDatos {

    public static void main(String[] args) {
        Queue<Personaje> colPersonajes = new LinkedList<>();
        ((LinkedList<Personaje>) colPersonajes).push(new Personaje("Kamisato Ayato", 1556));
        ((LinkedList<Personaje>) colPersonajes).push(new Personaje("Lyney", 2441));
        ((LinkedList<Personaje>) colPersonajes).push(new Personaje("Baizhu", 1256));
        
        
    }

}
