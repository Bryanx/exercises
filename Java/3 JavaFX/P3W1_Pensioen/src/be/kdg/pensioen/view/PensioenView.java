package be.kdg.pensioen.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * LEFT: geboorteJaar
 * CENTER: berekenButton
 * RIGHT: pensioenJaar
 *
 * Insets: TRouBLe
 */
public class PensioenView extends BorderPane {
    private TextField geboorteJaarField;
    private Button berekenButton;
    private Label pensioenJaarLabel;


    public PensioenView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.geboorteJaarField = new TextField();
        this.geboorteJaarField.setPrefColumnCount(4);
        this.berekenButton = new Button("Bereken");
        this.pensioenJaarLabel = new Label();
    }

    private void layoutNodes() {
        this.setLeft(geboorteJaarField);
        this.setCenter(berekenButton);
        this.setRight(pensioenJaarLabel);
        this.setPadding(new Insets(10));
    }

    Button getBerekenButton() {
        return berekenButton;
    }

    TextField getGeboorteJaarField() {
        return geboorteJaarField;
    }

    Label getPensioenJaarLabel() {
        return pensioenJaarLabel;
    }
}
