package Modelo.bloque.bloqueMovimiento;

import Modelo.bloque.Bloque;
import Modelo.direccion.Direccion;
import Modelo.personaje.Personaje;

public abstract class BloqueMovimiento implements Bloque{

    Direccion direccion;
    Direccion direcccionOpuesta;

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje){
        personaje.moverDireccion(direccion);
    }
    //Falta sus pruebas
    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje){ personaje.moverDireccion(direcccionOpuesta);}
}
