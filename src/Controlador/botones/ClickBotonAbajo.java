package Controlador.botones;

import Modelo.bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import Modelo.coordenas.Coordenada;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonAbajo implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    public ClickBotonAbajo(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Muevo personaje hacia abajo");
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoAbajo());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
    }
}
