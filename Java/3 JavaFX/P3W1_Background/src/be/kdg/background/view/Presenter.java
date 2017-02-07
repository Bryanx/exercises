package be.kdg.background.view;

import be.kdg.background.model.Kleuren;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Presenter {
    private Kleuren model;
    private View view;

    public Presenter(Kleuren model, View view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        // TODO
        view.getChangeButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updateView();
            }
        });
    }

    private void updateView() {
        view.setStyle(model.getBackgroundColour());
    }
}
