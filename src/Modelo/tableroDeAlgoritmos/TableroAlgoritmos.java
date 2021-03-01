package Modelo.tableroDeAlgoritmos;

import Modelo.bloque.Bloque;
import Modelo.bloque.bloqueSecuencial.BloqueSecuencial;
import Modelo.bloque.bloqueSecuencial.bloqueDeInversion.BloqueDeInversion;
import Modelo.bloque.bloqueSecuencial.bloqueDeRepeticion.BloqueDeRepeticion;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoDerecha;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import Modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import Modelo.bloque.bloquesdeLapiz.BloqueLapizBajar;
import Modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

import java.util.ArrayList;
import java.util.HashMap;

public class TableroAlgoritmos{
    private Personaje personaje;
    private SectorDibujo tableroDeDibujo;
    private ArrayList <Bloque> secuenciaAEjeutar;
    private HashMap <String, Bloque> bloquesDisponibles;
    private ArrayList <BloqueSecuencial> bloquesSecuenciales;

    public TableroAlgoritmos(){
        this.tableroDeDibujo = new SectorDibujo();
        this.personaje = new Personaje(tableroDeDibujo);
        this.secuenciaAEjeutar = new ArrayList <Bloque>();
        this.bloquesSecuenciales = new ArrayList<BloqueSecuencial>();
        this.bloquesDisponibles = new HashMap<>();
        this.agregarBloquesBasicos(this.bloquesDisponibles);
    }

    private void agregarBloquesBasicos(HashMap<String, Bloque> bloquesDisponibles) {
        bloquesDisponibles.put( "Arriba", new BloqueMovimientoArriba());
        bloquesDisponibles.put( "Abajo", new BloqueMovimientoAbajo());
        bloquesDisponibles.put( "Derecha", new BloqueMovimientoDerecha());
        bloquesDisponibles.put( "Izquierda", new BloqueMovimientoIzquierda());
        bloquesDisponibles.put( "Subir Lapiz", new BloqueLapizSubir());
        bloquesDisponibles.put( "Bajar Lapiz", new BloqueLapizBajar());
        bloquesDisponibles.put( "Repetir x2", new BloqueDeRepeticion(2));
        bloquesDisponibles.put( "Repetir x3", new BloqueDeRepeticion(3));
        bloquesDisponibles.put( "Inversion", new BloqueDeInversion());
    }

    // Encontrar la forma en la que la interfaz grafica le manda al tablero que modelo.bloque tiene que agregar
    public void agregarProximoBloqueAEjecutar( Bloque nuevoBloque){
        if(!bloquesSecuenciales.isEmpty()) {
            bloquesSecuenciales.get(bloquesSecuenciales.size() - 1).agregarBloque(nuevoBloque);
        } else {
            secuenciaAEjeutar.add(nuevoBloque);
        }
    }

    public void agregarBloqueSecuencial(BloqueSecuencial bloque){
        agregarProximoBloqueAEjecutar(bloque);
        bloquesSecuenciales.add(bloque);
    }

    public void limpiarSecuencia(){
        secuenciaAEjeutar.clear();
    }

    public void cerrarSecuencia(){
        if(!bloquesSecuenciales.isEmpty()) {
            bloquesSecuenciales.remove(bloquesSecuenciales.size() - 1);
        }
    }

    public void ejecutarSecuencia(){
        for( Bloque bloque: secuenciaAEjeutar) {
            bloque.ejecutarInstruccionSobrePersonaje(personaje);
        }
    }

    public void guardarAlgoritmo(String nombreAlgortimo){
        BloqueSecuenciaGuardada algoritmoAGuardar = new BloqueSecuenciaGuardada(secuenciaAEjeutar, nombreAlgortimo);
        bloquesDisponibles.put(nombreAlgortimo, algoritmoAGuardar);
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public Boolean listaSecuencialesIsVacio(){
        return bloquesSecuenciales.isEmpty();
    }
}
