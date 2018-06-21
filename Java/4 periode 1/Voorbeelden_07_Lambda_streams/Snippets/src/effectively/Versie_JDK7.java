package effectively;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Versie_JDK7 extends Application {
    public void start(Stage primaryStage) throws Exception {
        Button myButton = new Button("Klik me");
        final Label myLabel = new Label("Swing");
        final String myText = "JavaFX";
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myLabel.setText(myText);
            }
        });

        BorderPane myPane = new BorderPane();
        BorderPane.setAlignment(myButton, Pos.BASELINE_CENTER);
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
