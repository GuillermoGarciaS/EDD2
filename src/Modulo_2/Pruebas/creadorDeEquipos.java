package Modulo_2.Pruebas;

import java.util.LinkedList;
import java.util.Scanner;

class Jugador {
    //Declaramos lo unico que el jugador va a ocupar para ser registrado (* ^ ω ^)
    private String nombre;
    private byte numero;

    public Jugador(String nombre, byte numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return nombre + " " + numero;
    }
}

public class creadorDeEquipos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Jugador> lista = new LinkedList<>();

        byte opcion;

        do {
            System.out.println("Bienvenido al creador de equipos!\nQué deseas hacer?");
            System.out.println("1.- Registrar jugador\n2.- Acabar");

            opcion = scanner.nextByte();
            scanner.nextLine(); // Consume the newline character


            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre del jugador:");
                    String nombreJugador = scanner.nextLine();
                    System.out.println("Ingresa el número del jugador:");
                    byte numeroJugador = scanner.nextByte();

                    //El siguiente parametro nos sirve para evitar que un jugador con menos de 18 años se registre (｡•́︿•̀｡)
                    if (numeroJugador < 18) {
                        System.out.println("Jugador invalido, no cuenta con la edad suficiente");
                        break;
                    } else if (numeroJugador >= 18) {
                    Jugador jugador = new Jugador(nombreJugador, numeroJugador);
                    lista.add(jugador);
                    }

                    break;

                case 2:

                    //Aqui despues con un for imprimiremos la lista de jugadores ( ◡‿◡ *)
                    System.out.println("Aquí está tu lista de jugadores:");
                    for (Jugador j : lista) {
                        System.out.println(j);
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 2);

        //Una silly one si es que se desea acabar con ningun jugador registrado ♡( ◡‿◡ )
        if (lista.isEmpty()) {
            System.out.println("Nombre pues que chido equipo asjasuasj");
        }

        //Y no olvidemos cerrar el scanner para tener un codigo limpio y bonito (´ ε ` )♡
        scanner.close();
    }
}