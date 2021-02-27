package Modelo.bloque.bloqueMovimiento;

import Modelo.direccion.DireccionDerecha;
import Modelo.direccion.DireccionIzquierda;

public class BloqueMovimientoDerecha extends BloqueMovimiento {

    public BloqueMovimientoDerecha(){
        this.direccion = new DireccionDerecha();
        this.direcccionOpuesta = new DireccionIzquierda();
    }
}
