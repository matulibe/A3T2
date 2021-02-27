package Modelo.tableroDeAlgoritmos;

import Modelo.bloque.Bloque;
import Modelo.bloque.bloqueDeInversion.BloqueDeInversion;
import Modelo.bloque.bloqueDeRepeticion.BloqueDeRepeticion;
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

    public TableroAlgoritmos(){
        this.tableroDeDibujo = new SectorDibujo();
        this.personaje = new Personaje(tableroDeDibujo);
        this.secuenciaAEjeutar = new ArrayList <Bloque>();
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
        secuenciaAEjeutar.add(nuevoBloque);
    }

    //Posible nueva funcion para agregar el proximo bloque a ejecutar que contiene el hash map
    public void agregarProximoBloqueAEjecutar( String nombreBloque){
        Bloque nuevoBloque = bloquesDisponibles.get(nombreBloque);
        secuenciaAEjeutar.add(nuevoBloque);
    }

    public void ejecutarSecuencia(){
        for( Bloque bloque: secuenciaAEjeutar)
            bloque.ejecutarInstruccionSobrePersonaje(personaje);
    }

    public void guardarAlgoritmo(String nombreAlgoritmo){
        BloqueSecuenciaGuardada algoritmoAGuardar = new BloqueSecuenciaGuardada(secuenciaAEjeutar, nombreAlgoritmo);
        bloquesDisponibles.put(nombreAlgoritmo, algoritmoAGuardar);
    }

    public Personaje getPersonaje() {
        return personaje;
    }
}
