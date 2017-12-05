package effectively;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Versie_JDK8 extends Application {
    public void start(Stage primaryStage) throws Exception {
        Button myButton = new Button("Klik me");
        Label myLabel = new Label("Swing");
        String myText = "JavaFX";
        myButton.setOnAction(event -> myLabel.setText(myText));

        BorderPane.setAlignment(myButton, Pos.BASELINE_CENTER);
        BorderPane myPane = new BorderPane();
        myPane.setBottom(myButton);
        myPane.setCenter(myLabel);
        Scene myScene = new Scene(myPane, 300, 100);
        primaryStage.setTitle("Mijn eerste JavaFX");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
