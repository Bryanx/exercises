import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ButtonAction extends Application {
    private Button button = new Button("Klik hier!");

    @Override
    public void start(Stage primaryStage) throws Exception {
        button.setOnAction(event -> System.out.println("Je hebt geklikt"));

        primaryStage.setScene(new Scene(button));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
