package Modulo_3.Pruebas;

import java.util.Hashtable;


public class tablaHash {

    public static void main(String[] args) {

        Hashtable<Integer, String> tabla = new Hashtable<>(11);

        tabla.put(100, "Spongebob");
        tabla.put(123, "Patrick");
        tabla.put(321, "Sandy");
        tabla.put(555, "Squidward");
        tabla.put(777, "Gary");

        tabla.remove(777);

        for (Integer llave : tabla.keySet()) {

            System.out.println(llave.hashCode() % 10 + "\t" +  llave + "\t" + tabla.get(llave));

        }
        
    }
    
}
