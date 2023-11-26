package Modulo_3.pruebas;

public class arbolDosTres {

    static class nodoDelArbol {

        int llave1;
        int llave2;
        nodoDelArbol izquierda, mitad, derecha;

        public nodoDelArbol(int llave) {

            this.llave1 = llave;
            this.llave2 = -1; // el -1 indica que el nodo solo tiene una clave
            this.izquierda = null;
            this.mitad = null;
            this.derecha = null;

        }

        public nodoDelArbol(int llave1, int llave2) {

            this.llave1 = llave1;
            this.llave2 = llave2;
            this.izquierda = null;
            this.mitad = null;
            this.derecha = null;

        }

    }

    private nodoDelArbol raiz;

    public arbolDosTres() {
        
        this.raiz = null;

    }

    public void insertar(int llave) {

        if (raiz == null) {
            raiz = new nodoDelArbol(llave);
        } else {
            raiz = insertar(raiz, llave);
        }

    }

    private nodoDelArbol insertar(nodoDelArbol nodo, int llave) {

        if (nodo == null) {

            return new nodoDelArbol(llave);

        }

        if (nodo.llave2 == -1) {

            //Nodo tiene una clave
            if (llave < nodo.llave1) {

                nodo.llave2 = nodo.llave1;
                nodo.llave1 = llave;
                
            } else {

                nodo.llave2 = llave;

            }

        } else {

            // El nodo tiene dos claves

            if (llave < nodo.llave1) {

                nodo.izquierda = insertar(nodo.izquierda, llave);

            } else if (llave > nodo.llave2) {

                nodo.derecha = insertar(nodo.derecha, llave);

            } else {

                nodo.mitad = insertar(nodo.mitad, llave);

            }

            // La division del nodo

            if (nodo.llave2 != -1) {

                nodoDelArbol nodoPosicionMitad = new nodoDelArbol(nodo.llave2);
                nodoPosicionMitad.izquierda = nodo.mitad;
                nodoPosicionMitad.derecha = nodo.derecha;

                nodo.llave2 = -1;
                nodo.derecha = null;
                nodo.mitad = null;

                return nodoPosicionMitad;

            }

        }

        return nodo;

    }

    // Tanto la clase mostrar como la clase mostrarRecursivo, fueron dadas por un devenir entre ayudas y preguntas dadas entre
    // Yo y ChatGPT, definitivamente no se me ocurriría algo así, pero es algo de lo cual aprendere y buscare aplicar en
    // Futuros proyectos pequeños que busco realizar

    public void mostrar() {

        if (raiz != null) {

            mostrarRecursivo(raiz, 0);
        }

    }
    
    private void mostrarRecursivo(nodoDelArbol nodo, int nivel) {

        if (nodo != null) {

            mostrarRecursivo(nodo.derecha, nivel + 1);
    
            for (int i = 0; i < nivel; i++) {

                System.out.print("   ");

            }
    
            System.out.print(nodo.llave1);
            if (nodo.llave2 != -1) {

                System.out.print(", " + nodo.llave2);

            }

            System.out.println();
    
            mostrarRecursivo(nodo.izquierda, nivel + 1);
            mostrarRecursivo(nodo.mitad, nivel + 1);

        }

    }
    

    public static void main(String[] args) {

        arbolDosTres arbol = new arbolDosTres();
        int[] llaves = {1, 3, 5, 7, 10, 12, 15, 18, 20, 22, 25, 30};

        for (int llave : llaves) {

            arbol.insertar(llave);

        }

        arbol.mostrar();
    }
    
}