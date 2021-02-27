package Vista;

import Vista.configuradores.ConfiguradorInterface;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class  Interface extends Application {

    @Override
    public void start(Stage window) throws Exception{
        TableroAlgoritmos tableroAlgoritmos = new TableroAlgoritmos();
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("AlgoBlocks");

        VBox layout = new VBox();
        ConfiguradorInterface configurador = new ConfiguradorInterface();
        configurador.configurarVbox(layout,tableroAlgoritmos);

        window.setScene(new Scene(layout, 1000, 850));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    // Mostrar los bloques, hay que mostrar el tablero y el personaje
}