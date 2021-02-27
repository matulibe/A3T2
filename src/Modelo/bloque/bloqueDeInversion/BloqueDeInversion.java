package Modelo.bloque.bloqueDeInversion;

import Modelo.bloque.Bloque;
import Modelo.personaje.Personaje;

import java.util.ArrayList;

public class BloqueDeInversion implements Bloque {
    private ArrayList< Bloque> conjuntoDeBloques;
    
    public BloqueDeInversion(){
        this.conjuntoDeBloques = new ArrayList();
    }

    public void agregarBloque(Bloque bloqueNuevo){ conjuntoDeBloques.add(bloqueNuevo);}

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        for( Bloque bloque: conjuntoDeBloques)
            bloque.ejecutarInstruccionOpuestaSobrePersonaje(personaje);
    }


    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje) {
        for ( Bloque bloque: conjuntoDeBloques)
            bloque.ejecutarInstruccionSobrePersonaje( personaje);
    }
}
