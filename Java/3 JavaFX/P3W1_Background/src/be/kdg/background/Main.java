package be.kdg.background;

import be.kdg.background.model.Kleuren;
import be.kdg.background.view.Presenter;
import be.kdg.background.view.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Kleuren model = new Kleuren();
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        Scene scene = new Scene(view);

        primaryStage.setTitle("Colour");
        primaryStage.setScene(scene);

        // TODO: breedte en hoogte nog aanvullen (zie opgave)
        primaryStage.setWidth(400);
        primaryStage.setHeight(245);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
