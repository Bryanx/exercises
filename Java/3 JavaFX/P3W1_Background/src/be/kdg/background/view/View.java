package be.kdg.background.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class View extends BorderPane {
    private Button changeButton;

    public View() {
        initialiseNodes();
        updateView();
    }

    private void initialiseNodes() {
        this.changeButton = new Button("Change colour");
    }

    private void updateView() {
        setRight(changeButton);
        setAlignment(changeButton, Pos.BOTTOM_RIGHT);
        setPadding(new Insets(10));
    }

    Button getChangeButton() {
        return changeButton;
    }
}
