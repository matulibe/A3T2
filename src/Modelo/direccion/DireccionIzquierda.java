package Modelo.direccion;//package com.company;

//import package direccion;
import Modelo.coordenas.Coordenada; //package.Coordenada;

public class DireccionIzquierda extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverIzquierda();
    }
}
