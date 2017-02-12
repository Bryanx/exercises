package be.kdg.events;

import be.kdg.events.model.EventModel;
import be.kdg.events.view.EventPresenter;
import be.kdg.events.view.EventView;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-02-17 09:30
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        EventModel model = new EventModel();
        EventView view = new EventView();

        EventPresenter presenter =new EventPresenter(model, view);

        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(300);
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                if (presenter.textAreaHasText()) {
                    event.consume();
                }
            }
        });
        primaryStage.show();
    }
}
