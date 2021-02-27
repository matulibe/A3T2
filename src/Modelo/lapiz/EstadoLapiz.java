package Modelo.lapiz;

import Modelo.coordenas.Coordenada;
import Modelo.tablero_dibujo.SectorDibujo;

public abstract class EstadoLapiz {
    public abstract int dibujarLineaSobreElTablero(Coordenada principio, Coordenada fin, SectorDibujo tableroDeDibujo);

}
