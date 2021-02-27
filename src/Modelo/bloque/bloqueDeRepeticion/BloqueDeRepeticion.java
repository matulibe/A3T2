package Modelo.bloque.bloqueDeRepeticion;

import Modelo.bloque.Bloque;
import Modelo.personaje.Personaje;

import java.util.ArrayList;

public class BloqueDeRepeticion implements Bloque {

    private int cantidadDeCiclos;
    private ArrayList < Bloque> ciclo;

    public BloqueDeRepeticion(int repeticiones) {
        // Posiblemente haya que armar exepciones por si pasan numeros fuera de 2 o 3
        this.cantidadDeCiclos = repeticiones;
        this.ciclo = new ArrayList();
    }

    public void agregarBloque(Bloque bloqueNuevo) {
        ciclo.add(bloqueNuevo);
    }

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        ejecutarSecunciaDeBloquesRepetidasSobreElPersonaje(personaje);
    }


    // Devuelve un int con propositos de testeo, en teoria son la cantidad de veces que se recorre cada modelo.bloque con el
    // ciclo pero no devuelve el numero correcto si hay bloques de repeticion anidados
    public int ejecutarSecunciaDeBloquesRepetidasSobreElPersonaje(Personaje personaje) {
        for (int i = 0; i < cantidadDeCiclos; i++)
            for (Bloque bloque : ciclo)
                bloque.ejecutarInstruccionSobrePersonaje(personaje);
        return cantidadDeCiclos * ciclo.size();
    }

    //Faltan pruebas
    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje){
        for (int i = 0; i < cantidadDeCiclos; i++) {
            for (Bloque bloque: ciclo)
                bloque.ejecutarInstruccionOpuestaSobrePersonaje(personaje);
        }
    }
}
