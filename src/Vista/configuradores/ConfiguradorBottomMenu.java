package Vista.configuradores;

import Controlador.ClickBotonPlay;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ConfiguradorBottomMenu {

    public void configurarHbox(HBox bottomMenu, TableroAlgoritmos tablero) {
        Button botonEjecutarAlgoritmo = new Button("Ejecutar Algoritmo");
        botonEjecutarAlgoritmo.setOnAction(new ClickBotonPlay(tablero));
        Button botonGuardarAlgoritmo = new Button("Guardar Algoritmo");
        bottomMenu.getChildren().addAll(botonEjecutarAlgoritmo, botonGuardarAlgoritmo);
        bottomMenu.setAlignment(Pos.CENTER_RIGHT);
    }
}
