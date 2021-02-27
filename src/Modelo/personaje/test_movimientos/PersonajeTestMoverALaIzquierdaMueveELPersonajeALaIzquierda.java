package Modelo.personaje.test_movimientos;

import Modelo.direccion.DireccionIzquierda;
import junit.framework.TestCase;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

public class PersonajeTestMoverALaIzquierdaMueveELPersonajeALaIzquierda extends TestCase {
    private  SectorDibujo tablero = new SectorDibujo();
    private  DireccionIzquierda direccion = new DireccionIzquierda();

    public void testMoverDireccion() {
        Personaje personaje = new Personaje(tablero);
        int x_coordenada_vieja = personaje.getCoordenada().getX();
        personaje.moverDireccion(direccion);

        assertEquals( x_coordenada_vieja -1, personaje.getCoordenada().getX());
    }

    public void testMoverElPersonajeALaIzquierdaConUnLapizArribaNoDibujaUnaLinea(){
        Personaje personaje = new Personaje(tablero);

        assertEquals(0, personaje.moverDireccion(direccion));
    }

    public  void testMoverElPersonajeALaIzquierdaConUnLapizBajoDibujaUnaLinea(){
        Personaje personaje = new Personaje(tablero);
        personaje.bajarLapiz();

        assertEquals(1, personaje.moverDireccion(direccion));
    }
}