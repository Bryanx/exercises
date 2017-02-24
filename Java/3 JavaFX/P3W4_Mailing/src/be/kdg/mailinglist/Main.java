package be.kdg.mailinglist;

import be.kdg.mailinglist.model.MailingList;
import be.kdg.mailinglist.view.MailingListView;
import be.kdg.mailinglist.view.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        MailingList model = new MailingList();
        MailingListView view = new MailingListView();
        new Presenter(model, view);
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Mailing list");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
