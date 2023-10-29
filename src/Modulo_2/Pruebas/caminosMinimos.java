package Modulo_2.Pruebas;

public class caminosMinimos {

    // Método que usaremos para determinar los caminos más cortos entre vértices

    public String algoritmoFloyd(long [][] mAdy ) {
        int vertices = mAdy.length;
        long matrizAdyacencia[][] = mAdy;

        String caminos[][] = new String [vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminitos = "";

        // Variables de índices
        int i,j,k;

        float temporal1, temporal2, temporal3, temporal4, minimo;

        // Inicializar las matrices, caminos y caminosAuxiliares

        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminos [i][j] = "";
                caminosAuxiliares [i][j] = "";
            }
        }

        // Algoritmo de Floyd-Warshall para encontrar caminos más cortos

        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2 + temporal3;

                    // Encontrar el camino mínimo

                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminoRecorrido + (k + 1));
                        }
                    }
                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }

        // Agregar la matriz de caminos a cadena

        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";
            }
            cadena = cadena + "\n";
        }

        // Construir la cadena de caminos más cortos

        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 1000000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1) + ") irse por... (" + (i + 1) + ", " + (j + 1) + ")\n";
                        } else {
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1) + ") irse por... (" + (i + 1) + caminos[i][j]  + ", " + (j + 1) + ")\n";
                        }
                    }
                }
            }
        }

        return "La matriz de caminos más cortos entre los diferentes vértices es:\n" + cadena + 
        "\nLos diferentes caminos más cortos entre vértices son:\n" + caminitos;
    }

    // Función recursiva para reconstruir el camino más corto

    public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminoRecorrido) {
        if (caminosAuxiliares[i][k].equals("")) {
            return "";
        } else {
            // Recursividad
            caminoRecorrido += caminosR(i, Integer.parseInt(caminosAuxiliares[i][k]), caminosAuxiliares, caminoRecorrido) + (caminosAuxiliares[i][k] + 1) + ", ";
            return caminoRecorrido;
        }
    }
}
