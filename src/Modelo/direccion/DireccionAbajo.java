package Modelo.direccion;//package com.company;

//import package.Direccion;

import Modelo.coordenas.Coordenada;// package.Coordenada;

public class DireccionAbajo extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverAbajo();
    }
}