package Modulo_3.Actividad_11.Test;

/* 
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.HashMap;

public class Test {

    private static HashMap<String, Integer> empleados = new HashMap<>(21);

    @Before
    public void setUp() {
        empleados.clear(); // Limpia el HashMap antes de cada prueba.
    }

    @Test
    public void testIsEmpty() {
        assertTrue(empleados.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, empleados.size());
        
        empleados.put("Ejemplo1", 1000);
        assertEquals(1, empleados.size());
    }

    @org.junit.Test
    public void testInsertar() {
        empleados.put("Ejemplo2", 2000);
        assertEquals(Integer.valueOf(2000), empleados.get("Ejemplo2"));
    }

    @org.junit.Test
    public void testBusqueda() {
        empleados.put("Ejemplo3", 3000);
        assertEquals(Integer.valueOf(3000), empleados.get("Ejemplo3"));
    }

    @org.junit.Test
    public void testBorrar() {
        empleados.put("Ejemplo4", 4000);
        Integer salario = empleados.get("Ejemplo4");
        empleados.remove("Ejemplo4");
        assertNull(empleados.get("Ejemplo4"));
    }

}

*/