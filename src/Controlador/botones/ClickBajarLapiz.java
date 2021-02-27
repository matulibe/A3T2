package Controlador.botones;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.lapiz.Lapiz;

public class ClickBajarLapiz implements EventHandler<ActionEvent> {

    Lapiz lapiz;

    public ClickBajarLapiz(Lapiz unLapiz){
        lapiz = unLapiz;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        lapiz.bajarLapiz();
    }
}
