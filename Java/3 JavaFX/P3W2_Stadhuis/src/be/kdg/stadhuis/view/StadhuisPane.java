package be.kdg.stadhuis.view;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class StadhuisPane extends VBox {
    private static final Image IMAGE = new Image("be/kdg/stadhuis/view/images/stadhuis.jpg");

    private ImageView imageView;
    private RadioButton normal;
    private RadioButton blackAndWhite;
    private RadioButton sepia;

    public StadhuisPane() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        ToggleGroup tGroup = new ToggleGroup();
        this.imageView = new ImageView("be/kdg/stadhuis/view/images/stadhuis.jpg");
        this.normal = new RadioButton("Normaal");
        this.blackAndWhite =  new RadioButton("Zwart Wit");
        this.sepia =  new RadioButton("Sepia");
        normal.setToggleGroup(tGroup);
        blackAndWhite.setToggleGroup(tGroup);
        sepia.setToggleGroup(tGroup);
        normal.setSelected(true);
        this.setSpacing(15);
    }

    private void layoutNodes() {
        this.getChildren().add(imageView);
        this.getChildren().add(normal);
        this.getChildren().add(blackAndWhite);
        this.getChildren().add(sepia);
        this.setPadding(new Insets(15));
    }

    void resetEffect() {
        this.imageView.setEffect(null);
    }

    void applyBlackAndWhiteEffect() {
        ColorAdjust blackAndWhite = new ColorAdjust();
        blackAndWhite.setSaturation(-1.0);
        this.imageView.setEffect(blackAndWhite);
    }

    void applySepiaEffect() {
        SepiaTone sepiaTone = new SepiaTone();
        sepiaTone.setLevel(0.8);
        this.imageView.setEffect(sepiaTone);
    }

    RadioButton getNormal() {
        return normal;
    }

    RadioButton getBlackAndWhite() {
        return blackAndWhite;
    }

    RadioButton getSepia() {
        return sepia;
    }
}
