package Vista.configuradores;

import javafx.scene.control.Label;

public class ConfiguradorLabels {

    private void moverLabel(Label label, int y, int x){
        label.setTranslateX(x);
        label.setTranslateY(y);
    }

    public void configurarPosiciones(Label dibujo, Label movimiento){
        moverLabel(dibujo, -275, 810);
        moverLabel(movimiento, -310, 910);
    }
}
