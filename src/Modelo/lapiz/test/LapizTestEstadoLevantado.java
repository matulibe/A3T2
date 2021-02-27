package Modelo.lapiz.test;

import Modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import Modelo.coordenas.Coordenada;
import junit.framework.TestCase;
import Modelo.lapiz.EstadoLapizArriba;
import Modelo.lapiz.Lapiz;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

    public class LapizTestEstadoLevantado extends TestCase {
        private SectorDibujo tablero = new SectorDibujo();
        private Personaje personaje = new Personaje(tablero);

        public void testSeCreaUnLapizConElEstadoLevantado() {
            Lapiz lapiz = new Lapiz(tablero);

            assertTrue(lapiz.getEstado() instanceof EstadoLapizArriba);
        }

        public void testSeCreaUnLapizATravesDeUnPersonajeYSeCreaLevantado() {
            Lapiz lapiz = personaje.getLapiz();

            assertTrue(lapiz.getEstado() instanceof EstadoLapizArriba);
        }

        public void testLevantaLapizCambiaElEstadoDeUnLapiz() {
            Lapiz lapiz = new Lapiz(tablero);
            lapiz.levantarLapiz();

            assertTrue(lapiz.getEstado() instanceof EstadoLapizArriba);
        }

        public void testElPersonajeLevantaElLapizYseLevanta() {
            personaje.subirLapiz();

            assertTrue(personaje.getLapiz().getEstado() instanceof EstadoLapizArriba);
        }

        public void testElPersonajeRecibeLaInstruccionDeLevantarElLapizDeUnBloqueYElEstadoDelLapizQuedaLevantado() {
            BloqueLapizSubir bloque = new BloqueLapizSubir();
            bloque.ejecutarInstruccionSobrePersonaje(personaje);

            assertTrue(personaje.getLapiz().getEstado() instanceof EstadoLapizArriba);
        }

        public void testDibujarConUnaLineaSobreUnTableroConUnLapizLevantadoNoDibujaNada(){
            //Por razones de testeo no dibujar una linea devuelve 0
            Lapiz lapiz = new Lapiz(tablero);
            Coordenada c1 = new Coordenada();
            Coordenada c2 = new Coordenada(0,1);

            assertEquals( 0, lapiz.dibujarLinea(c1,c2));
        }

    }

