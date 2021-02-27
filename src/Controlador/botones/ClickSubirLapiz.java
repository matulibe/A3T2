package Controlador.botones;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.lapiz.Lapiz;

public class ClickSubirLapiz implements EventHandler<ActionEvent> {

    Lapiz lapiz;

    public ClickSubirLapiz(Lapiz unLapiz){
        lapiz = unLapiz;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        lapiz.levantarLapiz();
    }
}
