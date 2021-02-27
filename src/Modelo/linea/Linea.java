package Modelo.linea;

import Modelo.coordenas.Coordenada;

public class Linea {
    private Coordenada inicio;
    private Coordenada fin;
    public Linea( Coordenada inicio, Coordenada fin){
        //Crear una excepcion para cuando le pasas una coordenada que es el mismo punto, sino es aca  es en el personaje
        this.inicio = inicio;
        this.fin = fin;
    }

    // Metodos en un principio con fines de testeo
    public Coordenada getInicio() {
        return inicio;
    }

    public Coordenada getFin() {
        return fin;
    }
}
