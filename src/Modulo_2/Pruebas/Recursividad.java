package Modulo_2.Pruebas;

public class Recursividad {

    public void imprimir(int x) {

        if (x <= 500) {

            System.out.print(x + " ");

            imprimir(x + 1);
        }

    }
    
}
 