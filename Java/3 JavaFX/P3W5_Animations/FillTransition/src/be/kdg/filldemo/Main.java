package be.kdg.filldemo;

import be.kdg.filldemo.view.FillView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 14:53
 */
// TODO CSS toepassen
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FillView view = new FillView();

        Scene scene = new Scene(view);

        primaryStage.setTitle("FillDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
