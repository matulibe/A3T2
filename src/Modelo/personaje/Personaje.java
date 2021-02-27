package Modelo.personaje;//package tp2.1;

import Modelo.coordenas.Coordenada;
import Modelo.direccion.Direccion;
import Modelo.lapiz.Lapiz;
import Modelo.tablero_dibujo.SectorDibujo;

public class Personaje{
     private Lapiz lapiz;
     private Coordenada coordenada;
     private SectorDibujo tablero;
    public Personaje(SectorDibujo tableroDibujo){
        this.lapiz = new Lapiz(tableroDibujo);
        this.coordenada = new Coordenada();
        this.tablero = tableroDibujo;
    }
    public void bajarLapiz(){
        this.lapiz.bajarLapiz();
    }

    public void subirLapiz(){
        this.lapiz.levantarLapiz();
    }

    public int moverDireccion(Direccion unaDireccion){
        Coordenada vieja = new Coordenada( this.coordenada);
        unaDireccion.aplicarMovimiento(this.coordenada);
        tablero.moverPersonaje(this.coordenada);
        // Armar una posible excepcion aca por si el personaje no se mueve por X motivo
        return this.lapiz.dibujarLinea(vieja, this.coordenada);
    }

    //Este mensaje fue creado con fines de testeo
    public Coordenada getCoordenada() {
        return this.coordenada;
    }

    //Este mensjae fue creado con fines de testeo
    public Lapiz getLapiz() {
        return this.lapiz;
    }
}

