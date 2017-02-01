package be.kdg.helloworld;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Moet altijd extends Application zijn (anders kan hij niet gelauncht worden)
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label lblHello = new Label("Hello World!");
//        Button button = new Button("klik");
//        //plaats label in root
//        BorderPane root = new BorderPane(lblHello);
//        //plaats button in root
//        root.setBottom(button);
        Group group = new Group(lblHello);
        //voeg root toe aan scene
        Scene scene = new Scene(group, 300, 300);
        scene.setCursor(Cursor.CROSSHAIR);
        scene.setFill(Color.YELLOW);
        //voeg scene toe aan venster
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World!");
        //toon venster
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
