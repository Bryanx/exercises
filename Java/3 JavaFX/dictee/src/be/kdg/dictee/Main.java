package be.kdg.dictee;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * @author Bryan de Ridder
 * @version 1.0 31-01-17 11:42
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Een eigen borderpane aangemaakt:
        BorderPane root = new DicteeView();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Dictee");
        primaryStage.setWidth(250);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
