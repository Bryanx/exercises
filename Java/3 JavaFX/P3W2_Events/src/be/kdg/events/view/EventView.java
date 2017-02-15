package be.kdg.events.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-02-17 09:31
 */
public class EventView extends BorderPane {
    private TextArea taInput;
    private Button btnClear;

    public EventView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.taInput = new TextArea();
        this.btnClear = new Button("Clear");
    }

    private void layoutNodes() {

        this.setCenter(taInput);
        this.setBottom(btnClear);
        this.setAlignment(btnClear, Pos.CENTER);
    }

    TextArea getTaInput() {
        return taInput;
    }

    Button getBtnClear() {
        return btnClear;
    }
}
