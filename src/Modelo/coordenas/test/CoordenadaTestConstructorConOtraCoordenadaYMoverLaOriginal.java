package Modelo.coordenas.test;

import Modelo.coordenas.Coordenada;
import junit.framework.TestCase;

public class CoordenadaTestConstructorConOtraCoordenadaYMoverLaOriginal extends TestCase {
    public void testConstructorConOtraCoordenada(){
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(c1);
        c1.moverDerecha();
        int x_c1 = c1.getX();
        int x_c2 = c2.getX();
        assertNotSame(c1, c2);
        assertEquals(x_c1,x_c2+1);
    }

}