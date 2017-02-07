package be.kdg.layout;

import be.kdg.layout.models.FormModel;
import be.kdg.layout.views.FormPresenter;
import be.kdg.layout.views.FormView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Bryan de Ridder
 * @version 1.0 07-02-17 09:53
 */
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FormView view = new FormView();
        FormModel model = new FormModel();
        new FormPresenter(model, view);

        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(325);
        primaryStage.setMinHeight(525);
        primaryStage.setTitle("Layout");
        primaryStage.show();
    }
}
