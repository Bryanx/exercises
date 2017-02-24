package be.kdg.contact;

import be.kdg.contact.model.Messenger;
import be.kdg.contact.view.ContactPresenter;
import be.kdg.contact.view.ContactView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final Messenger model = new Messenger();
        final ContactView view = new ContactView();
        new ContactPresenter(model, view);
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Contact");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
