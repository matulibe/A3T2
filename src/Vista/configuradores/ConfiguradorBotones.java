package Vista.configuradores;

import Controlador.botones.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ConfiguradorBotones {

    private void moverBoton(Button boton, int y, int x){
        boton.setTranslateX(x);
        boton.setTranslateY(y);
    }


    public void configuararPosicionBotones(Button arriba, Button abajo, Button derecha, Button izquierda, Button botonPlay, Button repetir, Button inversion, Button subir, Button bajar) {
        moverBoton(arriba, 100, 820);
        moverBoton(abajo, 80, 820);
        moverBoton(derecha, 90, 815);
        moverBoton(izquierda, 85, 810);
        moverBoton(repetir, 100, 815);
        moverBoton(inversion, 75, 905);
        moverBoton(botonPlay, 270, 870);
        moverBoton(subir, -115, 905);
        moverBoton(bajar, -80, 905);
    }

    public void configuararAcciones(Button arriba, Button abajo, Button derecha, Button izquierda, Button botonPlay, Button repetir, Button inversion, Button subir, Button bajar, TableroAlgoritmos tableroAlgoritmos, TextField repeticiones) {
        arriba.setOnAction(new ClickBotonArriba(tableroAlgoritmos));
        abajo.setOnAction(new ClickBotonAbajo(tableroAlgoritmos));
        derecha.setOnAction(new ClickBotonDerecha(tableroAlgoritmos));
        izquierda.setOnAction(new ClickBotonIzquierda(tableroAlgoritmos));
        botonPlay.setOnAction(new ClickBotonPlay(tableroAlgoritmos));
        repetir.setOnAction(new ClickBotonRepeticion(tableroAlgoritmos, repeticiones));
        inversion.setOnAction(new ClickBotonInversion(tableroAlgoritmos));
        subir.setOnAction(new ClickSubirLapiz(tableroAlgoritmos.getPersonaje().getLapiz()));
        bajar.setOnAction(new ClickBajarLapiz(tableroAlgoritmos.getPersonaje().getLapiz()));
    }
}
