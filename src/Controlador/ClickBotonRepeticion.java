package Controlador;

import Modelo.bloque.bloqueSecuencial.bloqueDeRepeticion.BloqueDeRepeticion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.scene.layout.VBox;

public class ClickBotonRepeticion implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    int repeticiones;
    Integer posicion;
    VBox menu;
    public ClickBotonRepeticion(TableroAlgoritmos tableroAlgoritmos, int ciclos, int numero, VBox rightMenu){
        secuencia = tableroAlgoritmos;
        repeticiones = ciclos;
        menu = rightMenu;
        posicion = numero;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Agrego un bloque de repeticion");
        secuencia.agregarBloqueSecuencial(new BloqueDeRepeticion(repeticiones));
        menu.getChildren().get(posicion).setVisible(true);
    }
}
