package be.kdg.scramble;


import be.kdg.scramble.model.Scrambler;
import be.kdg.scramble.view.Presenter;
import be.kdg.scramble.view.ScramblerView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scrambler model = new Scrambler();
        ScramblerView view = new ScramblerView();
        new Presenter(model, view);

        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
