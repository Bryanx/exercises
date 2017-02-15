package be.kdg.rekenmachine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import be.kdg.rekenmachine.model.Calculator;
import be.kdg.rekenmachine.view.CalculatorPane;
import be.kdg.rekenmachine.view.Presenter;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Calculator model = new Calculator();
        CalculatorPane view = new CalculatorPane();

        new Presenter(model, view);

        primaryStage.setTitle("Rekenmachine");
        primaryStage.setScene(new Scene(view));
        primaryStage.show();
    }
}
