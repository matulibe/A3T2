package Modelo.bloque.bloqueDeRepeticion.test;

import Modelo.bloque.bloqueDeRepeticion.BloqueDeRepeticion;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import Modelo.bloque.bloquesdeLapiz.BloqueLapizBajar;
import Modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import junit.framework.TestCase;
import Modelo.lapiz.EstadoLapizAbajo;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

public class BloqueDeRepeticionTest extends TestCase {
    SectorDibujo tablero = new SectorDibujo();
    Personaje personaje = new Personaje(tablero);
    public void testSubirYBajarLapizEnDosCiclosEjecutaLaCantidadDeInstruccionesCorrectas(){
        BloqueDeRepeticion bucle = new BloqueDeRepeticion(2);
        bucle.agregarBloque( new BloqueLapizSubir());
        bucle.agregarBloque( new BloqueLapizBajar());

        assertEquals(4, bucle.ejecutarSecunciaDeBloquesRepetidasSobreElPersonaje(personaje));
    }

    public void testSubirYBajarLapizEnDosCiclosAUnPersonajeDejaElLapizEnElEstadoEsperado(){
        BloqueDeRepeticion loop = new BloqueDeRepeticion(3);
        loop.agregarBloque(new BloqueLapizSubir());
        loop.agregarBloque(new BloqueLapizBajar());

        loop.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizAbajo);
    }

    public void testUnBloqueDeRepeticionConMovimientosMueveAdecuadamenteAlPersonaje(){
        BloqueDeRepeticion bucle = new BloqueDeRepeticion(2);
        bucle.agregarBloque(new BloqueMovimientoArriba());

        bucle.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals( 2, personaje.getCoordenada().getY());
    }

    public void testUnBloqueDeRepeticionPuedeEstarDentroDeOtroBloqueDeRepeticionYEjecutarLaCantidadDeInstruccionesEsperadas(){
        BloqueDeRepeticion bucle = new BloqueDeRepeticion(2);
        BloqueDeRepeticion anidado = new BloqueDeRepeticion(2);

        anidado.agregarBloque(new BloqueMovimientoArriba());
        anidado.agregarBloque(new BloqueMovimientoArriba());
        bucle.agregarBloque(new BloqueMovimientoArriba());
        bucle.agregarBloque(anidado);
        bucle.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(10, personaje.getCoordenada().getY());
    }
}