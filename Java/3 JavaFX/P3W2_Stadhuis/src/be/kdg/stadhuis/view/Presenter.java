package be.kdg.stadhuis.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Presenter {
    private final StadhuisPane view;

    public Presenter(StadhuisPane view) {
        this.view = view;

        this.addEventHandlers();
    }

    private void addEventHandlers() {
        // TODO: voeg de event handlers toe aan je controls.
        view.getBlackAndWhite().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.applyBlackAndWhiteEffect();
            }
        });
        view.getNormal().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.resetEffect();
            }
        });
        view.getSepia().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.applySepiaEffect();
            }
        });
    }
}
