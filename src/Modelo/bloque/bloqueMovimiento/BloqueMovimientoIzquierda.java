package Modelo.bloque.bloqueMovimiento;

import Modelo.direccion.DireccionDerecha;
import Modelo.direccion.DireccionIzquierda;

public class BloqueMovimientoIzquierda extends BloqueMovimiento {

    public BloqueMovimientoIzquierda(){
        this.direccion = new DireccionIzquierda();
        this.direcccionOpuesta = new DireccionDerecha();
    }

}
