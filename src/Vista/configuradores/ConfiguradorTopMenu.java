package Vista.configuradores;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ConfiguradorTopMenu {

    public void configurarHbox(HBox topMenu, Insets margen) {
        Label texto = new Label("Bienvenido a Algo blocks");
        topMenu.setAlignment(Pos.CENTER);
        HBox.setMargin(texto, margen);
        topMenu.getChildren().add(texto);
    }
}
