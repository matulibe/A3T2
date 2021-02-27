package Vista.configuradores;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ConfiguradorInterface {
    ConfiguradorBotones configuradorbotones;
    ConfiguradorTextField configuradorTextField;
    ConfiguradorLabels configuradorLabels;
    public ConfiguradorInterface(){
        this.configuradorbotones = new ConfiguradorBotones();
        this.configuradorTextField = new ConfiguradorTextField();
        this.configuradorLabels = new ConfiguradorLabels();
    }
    public void configurarVbox(VBox layout, TableroAlgoritmos tableroAlgoritmos){
        TextField repeticiones = new TextField("");
        configuradorTextField.configurarPosiciones(repeticiones);

        Button arribaCLapiz = new Button("Arriba");
        Button abajoCLapiz = new Button("Abajo");
        Button derechaSLapiz = new Button("Derecha");
        Button izquierdaSLapiz = new Button("Izquierda");
        Button botonPlay = new Button("Play");
        Button repetir = new Button("Loop");
        Button inversion = new Button("Inversion");
        Button subirLapiz = new Button("Subir Lapiz");
        Button bajarLapiz = new Button("Bajar Lapiz");
        Label movimiento = new Label("Movimiento");
        Label lapiz = new Label("Opcion Lapiz");

        configuradorbotones.configuararPosicionBotones(arribaCLapiz,abajoCLapiz, derechaSLapiz, izquierdaSLapiz, botonPlay, repetir, inversion, subirLapiz, bajarLapiz);
        configuradorbotones.configuararAcciones(arribaCLapiz, abajoCLapiz, derechaSLapiz, izquierdaSLapiz, botonPlay, repetir, inversion, subirLapiz, bajarLapiz, tableroAlgoritmos, repeticiones);
        configuradorLabels.configurarPosiciones(movimiento, lapiz);

        layout.getChildren().addAll(arribaCLapiz, botonPlay, abajoCLapiz, izquierdaSLapiz, derechaSLapiz, repeticiones, repetir, inversion, movimiento, subirLapiz, bajarLapiz, lapiz);
    }
}
