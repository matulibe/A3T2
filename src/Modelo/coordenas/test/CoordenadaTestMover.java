package Modelo.coordenas.test;

import Modelo.coordenas.Coordenada;
import junit.framework.TestCase;

public class CoordenadaTestMover extends TestCase {

    public void testMoverIzquierda() {
        Coordenada coordenada = new Coordenada();
        int x_viejo = coordenada.getX();

        coordenada.moverIzquierda();

        assertEquals( x_viejo -1, coordenada.getX());
    }

    public void testMoverDerecha() {
        Coordenada coordenada = new Coordenada();
        int x_viejo = coordenada.getX();

        coordenada.moverDerecha();

        assertEquals( x_viejo+1, coordenada.getX());
    }

    public void testMoverArriba() {
        Coordenada coordenada = new Coordenada();
        int y_viejo = coordenada.getY();

        coordenada.moverArriba();

        assertEquals( y_viejo +1, coordenada.getY());
    }

    public void testMoverAbajo() {
        Coordenada coordenada = new Coordenada();
        int y_viejo = coordenada.getY();

        coordenada.moverAbajo();

        assertEquals( y_viejo -1, coordenada.getY());

    }
}