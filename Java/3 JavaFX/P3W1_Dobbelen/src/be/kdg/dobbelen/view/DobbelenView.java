package be.kdg.dobbelen.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.nio.file.Paths;

public class DobbelenView extends BorderPane {
    //TODO
    ImageView dobbel1;
    ImageView dobbel2;
    Button btnDobbel;

    public DobbelenView() {
        initialiseNodes();
        updateView();
    }

    private void initialiseNodes() {
        this.dobbel1 = new ImageView(new Image("be/kdg/dobbelen/view/images/die1.png"));
        this.dobbel2 = new ImageView(new Image("be/kdg/dobbelen/view/images/die1.png"));
        this.btnDobbel = new Button("Dobbel");
    }

    private void updateView() {
        btnDobbel.setPrefWidth(80);
        setLeft(dobbel1);
        setRight(dobbel2);
        setCenter(btnDobbel);
        setAlignment(btnDobbel, Pos.BOTTOM_CENTER);
        setAlignment(dobbel1, Pos.TOP_LEFT);
        setAlignment(dobbel2, Pos.TOP_RIGHT);
        setPadding(new Insets(10));
    }

    Button getBtnDobbel() {
        return btnDobbel;
    }

    ImageView getDobbel1() {
        return dobbel1;
    }

    ImageView getDobbel2() {
        return dobbel2;
    }
}
