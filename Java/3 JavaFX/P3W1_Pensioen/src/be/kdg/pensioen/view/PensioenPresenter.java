package be.kdg.pensioen.view;

import be.kdg.pensioen.model.Pensioen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PensioenPresenter {
    private Pensioen model;
    private PensioenView view;

    public PensioenPresenter(Pensioen model, PensioenView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getBerekenButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String gebJaar = view.getGeboorteJaarField().getText();
                model.setGeboorteJaar(Integer.parseInt(gebJaar));
                updateView();
            }
        });
    }

    private void updateView() {
        view.getPensioenJaarLabel().setText("" + model.getPensioenJaar());
    }
}
