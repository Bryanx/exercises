package be.kdg.dictee.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Bryan de Ridder
 * @version 1.0 31-01-17 12:09
 */
public class DicteeView extends BorderPane {
    private Button btnDictee;
    private TextArea taDictee;

    public DicteeView() {
        initializeNodes();
        layoutNodes();
    }

    private void initializeNodes() {
        btnDictee = new Button("Lees voor");
        taDictee = new TextArea();
    }

    private void layoutNodes() {
        this.setCenter(taDictee);
        this.setBottom(btnDictee);
        setAlignment(btnDictee, Pos.CENTER);
        setMargin(btnDictee, new Insets(10, 10, 20, 10));
        setMargin(taDictee, new Insets(20, 20, 0, 20));
    }

    //alleen de presenter kan er dan bij, model niet!
    Button getBtnDictee() {
        return btnDictee;
    }

    //alleen de presenter kan er dan bij, model niet!
    TextArea getTaDictee() {
        return taDictee;
    }
}
