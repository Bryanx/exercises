package be.kdg.parallell;

import be.kdg.parallell.view.ParallelView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 14:59
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ParallelView view = new ParallelView();
        Scene scene = new Scene(view, 640, 480);

        primaryStage.setTitle("Two Balls");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}


