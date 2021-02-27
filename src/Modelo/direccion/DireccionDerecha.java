package Modelo.direccion;//package com.company;

//import package.Direccion;
import Modelo.coordenas.Coordenada;// package.Coordenada;

public class DireccionDerecha extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverDerecha();
    }
}
