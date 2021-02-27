package Modelo.bloque.bloquesdeLapiz.test;

import Modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import junit.framework.TestCase;
import Modelo.lapiz.EstadoLapizArriba;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

public class BloqueLapizSubirTest extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueLapizSubir bloque = new BloqueLapizSubir();

        personaje.bajarLapiz();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizArriba);
    }
}