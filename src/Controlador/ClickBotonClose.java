package Controlador;

import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;

public class ClickBotonClose implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    VBox menu;
    Integer posicion;
    public ClickBotonClose(TableroAlgoritmos tablero, VBox rightMenu, int numero){
        secuencia = tablero;
        menu = rightMenu;
        posicion = numero;
    }

    public void modificarVisibilidadClose(VBox botones, TableroAlgoritmos tablero){
        if(!tablero.listaSecuencialesIsVacio()){
            botones.getChildren().get(posicion).setVisible(true);
        }else{
            botones.getChildren().get(posicion).setVisible(false);
        }
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Cierro bloque secuencial");
        secuencia.cerrarSecuencia();
        this.modificarVisibilidadClose(menu, secuencia);
    }
}
