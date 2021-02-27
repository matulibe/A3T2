package Modelo.bloque.bloqueMovimiento;

import Modelo.direccion.DireccionAbajo;
import Modelo.direccion.DireccionArriba;

public class BloqueMovimientoArriba extends BloqueMovimiento {

    public  BloqueMovimientoArriba(){
        this.direccion = new DireccionArriba();
        this.direcccionOpuesta = new DireccionAbajo();
    }

}
