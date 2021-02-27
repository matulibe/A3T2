package Modelo.bloque.bloqueMovimiento;

import Modelo.direccion.DireccionAbajo;
import Modelo.direccion.DireccionArriba;

public class BloqueMovimientoAbajo extends BloqueMovimiento {

    public BloqueMovimientoAbajo(){
        this.direccion = new DireccionAbajo();
        this.direcccionOpuesta = new DireccionArriba();
    }


}
