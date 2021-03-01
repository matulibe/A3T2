package Modelo.bloque.bloqueSecuencial.bloqueDeInversion;

import Modelo.bloque.Bloque;
import Modelo.bloque.bloqueSecuencial.BloqueSecuencial;
import Modelo.personaje.Personaje;

import java.util.ArrayList;

public class BloqueDeInversion extends BloqueSecuencial {
    private ArrayList< Bloque> conjuntoDeBloques;
    
    public BloqueDeInversion(){
        conjuntoDeBloques = new ArrayList();
    }

    public void agregarBloque(Bloque bloqueNuevo){ conjuntoDeBloques.add(bloqueNuevo);}

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        for( Bloque bloque: conjuntoDeBloques) {
            bloque.ejecutarInstruccionOpuestaSobrePersonaje(personaje);
        }
    }


    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje) {
        for ( Bloque bloque: conjuntoDeBloques)
            bloque.ejecutarInstruccionSobrePersonaje( personaje);
    }
}
