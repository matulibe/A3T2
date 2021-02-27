package Modelo.bloque.bloquesdeLapiz.test;

import Modelo.bloque.bloquesdeLapiz.BloqueLapizBajar;
import junit.framework.TestCase;
import Modelo.lapiz.EstadoLapizAbajo;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

public class BloqueLapizBajarTestLeBajaElLapizAUnPersonaje extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueLapizBajar bloque = new BloqueLapizBajar();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizAbajo);

    }
}