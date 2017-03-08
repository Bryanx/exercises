package be.kdg.fade.view;

import javafx.animation.FadeTransition;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 14:40
 */
public class Presenter {
    private FadeView view;

    public Presenter(FadeView view) {
        this.view = view;
        handleEvents();
    }

    private void handleEvents() {
        view.getImageView().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                FadeTransition transition = new FadeTransition();
                transition.setNode(view.getImageView());
                transition.setDuration(new Duration(2000));
                transition.setFromValue(1.0);
                transition.setToValue(0.0);
                transition.setCycleCount(4);
                transition.setAutoReverse(true);
                transition.play();
            }
        });
    }
}
