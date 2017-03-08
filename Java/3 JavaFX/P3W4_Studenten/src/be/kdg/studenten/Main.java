package be.kdg.studenten;

import be.kdg.studenten.model.StudentAdministratie;
import be.kdg.studenten.view.Presenter;
import be.kdg.studenten.view.StudentView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        StudentAdministratie model = new StudentAdministratie();
        StudentView view = new StudentView();
        new Presenter(model, view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Studenten");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
