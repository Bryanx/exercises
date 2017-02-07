package be.kdg.pensioen;

import be.kdg.pensioen.model.Pensioen;
import be.kdg.pensioen.view.PensioenPresenter;
import be.kdg.pensioen.view.PensioenView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pensioen model = new Pensioen();
        PensioenView view = new PensioenView();
        PensioenPresenter presenter = new PensioenPresenter(model, view);
        Scene scene = new Scene(view);

        // Hier nog de hoofding (titel) instellen
        primaryStage.setTitle("Pensioenjaar");
        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
