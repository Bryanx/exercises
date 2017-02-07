package be.kdg.dictee;

import be.kdg.dictee.model.Dictee;
import be.kdg.dictee.view.DicteePresenter;
import be.kdg.dictee.view.DicteeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Bryan de Ridder
 * @version 1.0 31-01-17 11:42
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Dictee model = new Dictee();
        DicteeView view = new DicteeView();

        new DicteePresenter(model, view);
        Scene scene = new Scene(view);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Dictee");
        primaryStage.setWidth(250);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
