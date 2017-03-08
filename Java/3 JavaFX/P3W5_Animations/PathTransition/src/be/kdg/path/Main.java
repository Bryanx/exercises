package be.kdg.path;

import be.kdg.path.view.PathView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 18:16
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        PathView  view = new PathView();
        Scene scene = new Scene(view, 640, 480);

        primaryStage.setTitle("Path Transition");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
