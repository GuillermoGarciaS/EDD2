package Modulo_2.Actividad_7.Ordenamiento;

public class metricas {

    private int comparacion;
    private int movimientos;

    public metricas() {
        comparacion = 0;
        movimientos = 0;
    }

    public void incrementComparacion() {
        comparacion++;
    }

    public void incrementMovimientos() {
        movimientos++;
    }

    public int getComparacion() {
        return comparacion;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void reinicio() {
        comparacion = 0;
        movimientos = 0;
    }
}