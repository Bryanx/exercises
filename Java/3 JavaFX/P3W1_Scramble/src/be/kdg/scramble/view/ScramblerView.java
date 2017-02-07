package be.kdg.scramble.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ScramblerView extends BorderPane {
    Button btnScramble;
    TextField taScramble;

    public ScramblerView() {
        initialiseNodes();
        updateView();
    }

    private void initialiseNodes() {
        this.btnScramble = new Button("Scramble");
        this.taScramble = new TextField();
    }


    private void updateView() {
        this.setCenter(taScramble);
        this.setBottom(btnScramble);
        this.setPadding(new Insets(10));
        this.setAlignment(btnScramble, Pos.CENTER);
    }

    Button getBtnScramble() {
        return btnScramble;
    }

    TextField getTaScramble() {
        return taScramble;
    }
}
