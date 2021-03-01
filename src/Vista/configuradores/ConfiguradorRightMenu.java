package Vista.configuradores;

import Controlador.*;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class ConfiguradorRightMenu {
    int numero = 6;
    public void configurarVBox(VBox rightMenu, TableroAlgoritmos tablero) {
        ArrayList<Button> botones = new ArrayList<>();
        this.crearBotonesMenuDerecho(botones, tablero, rightMenu);

        rightMenu.setSpacing(10);
        rightMenu.setAlignment(Pos.TOP_CENTER);
        for (Button boton : botones) {
            rightMenu.getChildren().add(boton);
        }
    }

    private void crearBotonesMenuDerecho(ArrayList<Button> botones, TableroAlgoritmos tablero, VBox rightMenu) {
        this.crearBotonArriba(botones, tablero);
        this.crearBotonAbajo(botones, tablero);
        this.crearBotonDerecha(botones, tablero);
        this.crearBotonIzquierda(botones, tablero);
        this.crearBotonSubirLapiz(botones, tablero);
        this.crearBotonBajarLapiz(botones, tablero);
        this.crearBotonClose(botones, tablero, rightMenu);
        this.crearBotonRepetir2Veces(botones, tablero, numero, rightMenu);
        this.crearBotonRepetir3Veces(botones, tablero, numero, rightMenu);
        this.botonInvertirBotones(botones, tablero, numero, rightMenu);
    }

    private void crearBotonArriba(ArrayList<Button> botones, TableroAlgoritmos tablero) {
        Button botonArriba = new Button("Arrbia");
        botonArriba.setOnAction(new ClickBotonArriba(tablero));
        botones.add(botonArriba);
    }

    private void crearBotonAbajo(ArrayList<Button> botones, TableroAlgoritmos tablero) {
        Button botonAbajo = new Button("Abajo");
        botonAbajo.setOnAction(new ClickBotonAbajo(tablero));
        botones.add(botonAbajo);
    }

    private void crearBotonDerecha(ArrayList<Button> botones, TableroAlgoritmos tablero) {
        Button botonDerecha = new Button("Derecha");
        botonDerecha.setOnAction(new ClickBotonDerecha(tablero));
        botones.add(botonDerecha);
    }

    private void crearBotonIzquierda(ArrayList<Button> botones, TableroAlgoritmos tablero) {
        Button botonIzquierda = new Button("Izquierda");
        botonIzquierda.setOnAction(new ClickBotonIzquierda(tablero));
        botones.add(botonIzquierda);
    }

    private void crearBotonSubirLapiz(ArrayList<Button> botones, TableroAlgoritmos tablero) {
        Button botonSubirLapiz = new Button("Subir Lapiz");
        botonSubirLapiz.setOnAction(new ClickSubirLapiz(tablero.getPersonaje().getLapiz()));
        botones.add(botonSubirLapiz);
    }

    private void crearBotonBajarLapiz(ArrayList<Button> botones, TableroAlgoritmos tablero) {
        Button botonBajarLapiz = new Button("Bajar Lapiz");
        botonBajarLapiz.setOnAction(new ClickBajarLapiz(tablero.getPersonaje().getLapiz()));
        botones.add(botonBajarLapiz);
    }

    private void crearBotonRepetir2Veces(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu) {
        Button botonRepetir2veces = new Button("Repetir x 2");
        botonRepetir2veces.setOnAction(new ClickBotonRepeticion(tablero, 2, numero, rightMenu));
        botones.add(botonRepetir2veces);
    }

    private void crearBotonRepetir3Veces(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu) {
        Button botonRepetir2veces = new Button("Repetir x 3");
        botonRepetir2veces.setOnAction(new ClickBotonRepeticion(tablero, 3, numero, rightMenu));
        botones.add(botonRepetir2veces);
    }

    private void botonInvertirBotones(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu) {
        Button botonInvertirBloques = new Button("Invertir Bloques");
        botonInvertirBloques.setOnAction(new ClickBotonInversion(tablero, numero, rightMenu));
        botones.add(botonInvertirBloques);
    }

    private void crearBotonClose(ArrayList<Button> botones, TableroAlgoritmos tablero, VBox rightMenu){
        Button close = new Button("Close");
        botones.add(close);
        close.setOnAction(new ClickBotonClose(tablero, rightMenu, botones.indexOf(close)));
        botones.get(botones.indexOf(close)).setVisible(false);
        numero = botones.indexOf(close);
    }

}

