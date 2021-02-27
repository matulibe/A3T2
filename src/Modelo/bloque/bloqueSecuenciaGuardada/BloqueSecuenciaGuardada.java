package Modelo.bloque.bloqueSecuenciaGuardada;

import Modelo.bloque.Bloque;
import Modelo.personaje.Personaje;

import java.util.ArrayList;

public class BloqueSecuenciaGuardada implements Bloque {
    private ArrayList <Bloque> secuenciaGuardada;
    private String nombre;

    public BloqueSecuenciaGuardada (ArrayList <Bloque> secuenciaAGuardar, String nombre){
        this.secuenciaGuardada = new ArrayList<Bloque>(secuenciaAGuardar);
        this.nombre = nombre;
    }

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        for( Bloque bloque: secuenciaGuardada)
            bloque.ejecutarInstruccionSobrePersonaje(personaje);
    }

    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje) {
        for (Bloque bloque: secuenciaGuardada)
            bloque.ejecutarInstruccionOpuestaSobrePersonaje(personaje);
    }
    public int tamanioAlgoritmo(){
        return secuenciaGuardada.size();
    }
    //Propositos de Testeo
    public String getNombre() {
        return nombre;
    }
}
