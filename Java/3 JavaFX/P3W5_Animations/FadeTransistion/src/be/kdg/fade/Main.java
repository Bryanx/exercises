package be.kdg.fade;

import be.kdg.fade.view.FadeView;
import be.kdg.fade.view.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 14:39
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FadeView view = new FadeView();
        new Presenter(view);
        Scene scene = new Scene(view);

        primaryStage.setTitle("Fade Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
