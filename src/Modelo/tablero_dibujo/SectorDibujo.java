package Modelo.tablero_dibujo;

import Modelo.coordenas.Coordenada;
import Modelo.linea.Linea;

import java.util.ArrayList;

// Armar para que sea un Observable, y que notifique cada vez que se mueve el personaje y se dibuje una linea
// Puede ser que esta clase y el tablero del algoritmos sean los unicos que se comuniquen con la vista

public class SectorDibujo {
    // Guardar las lineas que se dibujan en una lista o un Array?
    private ArrayList< Linea> coleccionLineas;
    // Cambia para que guarde una referencia al personaje
    private Coordenada coordenadaPersonaje;
    public SectorDibujo(){
        this.coleccionLineas = new ArrayList();
        this.coordenadaPersonaje = new Coordenada();
    }

    //public void setCoordenadaPersonaje(Coordenada unaCoordenada){ this.coordenadaPersonaje = unaCoordenada;}
    public void moverPersonaje(Coordenada unaCoordenada){
        this.coordenadaPersonaje = unaCoordenada;
    }

    //La funcion devuelve el numero de elementos en la lista con proposito de testeo

    public void agregarLinea(Linea unaLinea){
        coleccionLineas.add( unaLinea);
        // Agregar un notify aca
    }

    public int cantidadDeLineasDibujadas(){
        return coleccionLineas.size();
    }

    // Funcion con fines de testeo
    public Coordenada getCoordenadaPersonaje() {
        return coordenadaPersonaje;
    }
}
