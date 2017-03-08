package be.kdg.fade.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 14:40
 */
public class FadeView extends VBox {
    private ImageView imageView;
    private Label fadeLabel;

    public FadeView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        //   Image images = new Image(getClass().getResourceAsStream("/be/kdg/fade/view/images/sunandsea.jpg"));

        imageView = new ImageView();
        imageView.setFitHeight(459);
        imageView.setFitWidth(615);
        Image image = new Image("/be/kdg/fade/view/images/sunandsea.jpg", true);  // Load in background
        imageView.setImage(image);

        fadeLabel = new Label("Klik op de afbeelding om het effect te zien");
        setAlignment(Pos.CENTER);
        fadeLabel.setPadding(new Insets(5, 0, 15, 0));
    }

    private void layoutNodes() {
        // Test ScrollPane
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(imageView);
        //    scrollPane.setPrefSize(400, 300);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        setSpacing(10);
        getChildren().addAll(scrollPane, fadeLabel);
    }

    ImageView getImageView() {
        return imageView;
    }
}
