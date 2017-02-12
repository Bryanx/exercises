package be.kdg.events.view;

import be.kdg.events.model.EventModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-02-17 09:31
 */
public class EventPresenter {
    private EventModel model;
    private EventView view;

    public EventPresenter(EventModel model, EventView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        view.getBtnClear().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.getTaInput().clear();
            }
        });
        view.getTaInput().setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                String letter = event.getCharacter();

                if (model.isCapital(letter)) event.consume();
            }
        });
        view.getTaInput().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton().equals(MouseButton.PRIMARY)) {
                    view.getTaInput().setText(view.getTaInput().getText() + view.getTaInput().getText());
                }
            }
        });
    }

    private void updateView() {
    }


    public boolean textAreaHasText() {
        return view.getTaInput().getText().length() > 0;
    }
}