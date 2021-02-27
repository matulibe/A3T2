package Modelo.lapiz;//package com.company;


import Modelo.coordenas.Coordenada;
import Modelo.tablero_dibujo.SectorDibujo;

public class Lapiz{
      private EstadoLapiz estado;
      private SectorDibujo tablero;

      public Lapiz(SectorDibujo sector){
        this.estado = new EstadoLapizArriba();
        this.tablero = sector;
      }

      public void levantarLapiz(){
            estado = new EstadoLapizArriba();
        }

      public void bajarLapiz(){
            estado = new EstadoLapizAbajo();
        }

        //Devuelve un numero con propositos de testeos

      public int dibujarLinea(Coordenada desde, Coordenada hasta) {
        return this.estado.dibujarLineaSobreElTablero( desde, hasta, tablero);
      }

      //funcion con fines de testeo
      public EstadoLapiz getEstado() {
        return estado;
      }
}

/*
public abstract class Lapiz{
    // Agregar un atributo de sector de dibujo y el constructor recibe un tablero de Dibujo
    // Dibujar linea recibe dos coordenadas, desde donde y hasta donde se tiene que dibujar la linea
    private SectorDibujo tablero;
    public abstract int dibujarLinea(Coordenada desde, Coordenada hasta);
}
*/

