package Controlador;

import Modelo.bloque.Bloque;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ClickBotonGuardar implements EventHandler<ActionEvent> {
    TableroAlgoritmos tablero;
    ArrayList<Bloque> secuencia;
    public ClickBotonGuardar(TableroAlgoritmos tableroAlgoritmos){
        tablero = tableroAlgoritmos;
    }

    public static void display(String tittle, String message){
        VBox layout = new VBox();
        TextField label = new TextField();
        label.setPromptText("Nombre");
        Scene escena = new Scene(layout, 200, 100);
        Stage ventana = new Stage();
        layout.getChildren().addAll(label);
        layout.setAlignment(Pos.CENTER);
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setScene(escena);
        ventana.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Guardo Secuencia actual");
        this.display("Agrega el nombre", "Funca?");
    }
}