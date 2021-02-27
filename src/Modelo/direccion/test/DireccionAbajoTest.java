package Modelo.direccion.test;

import Modelo.coordenas.Coordenada;
import Modelo.direccion.DireccionAbajo;
import junit.framework.TestCase;

public class DireccionAbajoTest extends TestCase {

    public void testAplicarMovimiento() {
        Coordenada coordenada = new Coordenada();
        DireccionAbajo direccionAbajo = new DireccionAbajo();
        int y_viejo = coordenada.getY();

        direccionAbajo.aplicarMovimiento(coordenada);

        assertEquals( y_viejo -1, coordenada.getY());

    }
}