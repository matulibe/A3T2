package Controlador.botones;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonPlay implements EventHandler<ActionEvent>{
    TableroAlgoritmos secuencia;
    public ClickBotonPlay(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Play");
        secuencia.ejecutarSecuencia();
        System.out.println(" Y= "+secuencia.getPersonaje().getCoordenada().getY());
        System.out.println(" X= "+secuencia.getPersonaje().getCoordenada().getX());
    }
}
