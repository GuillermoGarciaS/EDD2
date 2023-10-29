package Modulo_2.Pruebas;

public class elMain {

    public static void main(String[] args) {
        
        long matrizA[][] = {{0,3,4,99999999,8,999999999}, {3,4,6,99999999,0,999999999}, {2,4,6,99999999,1,999999999}};
        caminosMinimos ruta = new caminosMinimos();
        System.out.println(ruta.algoritmoFloyd(matrizA));

    }
    
}
