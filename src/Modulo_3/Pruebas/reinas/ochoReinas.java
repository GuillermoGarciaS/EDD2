package Modulo_3.Pruebas.reinas;

public class ochoReinas {

     int listaResultados[];
     boolean visitado[];
     int reinas = 8;

    public static int calcularOpcciones(int resultado[], int columna, boolean visitado[], int fila) {

        if (columna == resultado.length) {

            

        } else {

            for (fila = 0; fila < resultado.length; fila++) {

                if (/*Visitado contiene fila */) {

                    //Saltar iteracion

                }

                if (/*Lugar valido*/(resultado, fila, columna)) {

                    resultado[columna] = fila;
                    visitado[fila] = true;
                    calcularOpciones(resultado, columna + 1);

                }

            }

        }

        // Si r2 > r1

        //r = renglon c = columna

        // Si r1 + c1 == r2 - c2
        //hay diagonal 


        //Cambiar esto, no va a regresar el n° de columnas
        return columna;
    }
    
}