package Modulo_2.Actividad_9;

public class prim {

    public static void main(String[] args) {
        
        int grafo[][] = new int [][] { 

                                /* A */ {0,4,3,0,0,0,0}, /* B */ {4,0,0,0,12,5,0},
                                /* C */ {3,0,0,7,10,0,0}, /* D */ {0,0,7,0,2,0,0},
                                /* E */ {0,0,10,2,0,0,5}, /* F */ {0,5,0,0,0,0,16},
                                /* G */ {0,0,0,0,5,16,0},};

        int visitado[] = new int[7];
        int minimo = 999, u = 0, v = 0, total = 0;

        for (int i = 0; i < 7; i++) {

            visitado[i] = 0;

            for (int j = 0; j < 7; j++) {

                if (grafo[i][j] == 0) {

                    grafo[i][j] = 999;
                }

            }

        }

        visitado[0] = 1;

        for (int contador = 0; contador < 6; contador++) {

            minimo = 999;

            for (int i = 0; i < 7; i++) {

                if (visitado[i] == 1) {

                    for (int j = 0; j < 7; j++) {

                        if (visitado[j] == 0) {

                            if (minimo > grafo[i][j]) {

                                minimo = grafo[i][j];
                                u = i;
                                v = j;

                            }

                        }

                    }

                }

            }

            visitado[v] = 1;
            total = total + minimo;
            System.out.println("Origen: " + u + " ---> " + v + ": " + minimo);

        }

        System.out.println("Peso total del grafo: " + total);

    }
    
}
