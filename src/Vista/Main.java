package Vista;


import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Vista.configuradores.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        TableroAlgoritmos tablero = new TableroAlgoritmos();
        window.setTitle("AlgoBlocks");


        Insets margen = new Insets(10,10,10,10);
        HBox topMenu = new HBox();
        ConfiguradorTopMenu configuradorTopMenu = new ConfiguradorTopMenu();
        configuradorTopMenu.configurarHbox(topMenu, margen);

        VBox rightMenu = new VBox();
        ConfiguradorRightMenu configuradorRightMenu= new ConfiguradorRightMenu();
        configuradorRightMenu.configurarVBox(rightMenu, tablero);


        HBox bottomMenu = new HBox(5);
        ConfiguradorBottomMenu configuradorBottomMenu = new ConfiguradorBottomMenu();
        configuradorBottomMenu.configurarHbox( bottomMenu, tablero);

        ListView< String> leftMenu = new ListView<>();
        ConfiguradorLeftMenu configuradorLeftMenu = new ConfiguradorLeftMenu();
        configuradorLeftMenu.configurarListView(leftMenu, tablero);

        GridPane mapa = new GridPane();
        ConfiguradorMapa configuradorMapa = new ConfiguradorMapa();
        configuradorMapa.configurarGridPane(mapa);

        BorderPane layout = new BorderPane();
        this.settearLayout(layout, topMenu, rightMenu, bottomMenu, mapa, leftMenu , margen);

        window.setScene(new Scene(layout, 1000, 600));
        window.show();
    }


    private void settearLayout(BorderPane layout, HBox topMenu, VBox rightMenu, HBox bottomMenu, GridPane mapa, ListView<String> leftMenu, Insets margen) {
        BorderPane.setAlignment(topMenu, Pos.TOP_CENTER);
        BorderPane.setMargin(topMenu, margen);
        BorderPane.setAlignment(rightMenu, Pos.CENTER);
        BorderPane.setMargin(rightMenu, margen);
        BorderPane.setAlignment( bottomMenu, Pos.TOP_LEFT);
        BorderPane.setMargin(bottomMenu, margen);
        BorderPane.setAlignment(mapa, Pos.CENTER);
        BorderPane.setMargin(mapa, margen);
        BorderPane.setAlignment(leftMenu, Pos.CENTER);
        BorderPane.setMargin(leftMenu, margen);
        layout.setTop(topMenu);
        layout.setRight(rightMenu);
        layout.setBottom( bottomMenu);
        layout.setCenter(mapa);
        layout.setLeft(leftMenu);
    }

    public static void main(String[] args) {
        launch(args);
    }
    // Mostrar los bloques, hay que mostrar el tablero y el personaje
}
