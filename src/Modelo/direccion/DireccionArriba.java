package Modelo.direccion;//package com.company;

//import package.Direccion;
import Modelo.coordenas.Coordenada;
//package coordenadas;

public class DireccionArriba extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverArriba();
    }
}
