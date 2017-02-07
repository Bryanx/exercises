package be.kdg.dictee.view;

import be.kdg.dictee.model.Dictee;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Bryan de Ridder
 * @version 1.0 03-02-17 09:04
 */
public class DicteePresenter {
    private Dictee model;
    private DicteeView view;

    public DicteePresenter(Dictee model, DicteeView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        //eventhandler aan de knop hangen
        //tekst uit het tekstveld lezen
        //tekst aan model geven op voor te lezen
        view.getBtnDictee().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String text = view.getTaDictee().getText();
                model.setTekst(text);
                model.leesVoor();
            }
        });
    }

    private void updateView() {
    }
}
