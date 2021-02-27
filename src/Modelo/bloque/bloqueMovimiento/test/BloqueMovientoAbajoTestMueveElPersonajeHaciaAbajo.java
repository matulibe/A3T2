package Modelo.bloque.bloqueMovimiento.test;

import Modelo.bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import junit.framework.TestCase;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

public class BloqueMovientoAbajoTestMueveElPersonajeHaciaAbajo extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje(){
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueMovimientoAbajo bloque = new BloqueMovimientoAbajo();
        int y_viejo = personaje.getCoordenada().getY();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals( y_viejo-1, personaje.getCoordenada().getY());
    }

}