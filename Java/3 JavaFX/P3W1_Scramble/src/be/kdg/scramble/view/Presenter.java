package be.kdg.scramble.view;


import be.kdg.scramble.model.Scrambler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Scanner;

public class Presenter {
    Scrambler model;
    ScramblerView view;

    public Presenter(Scrambler model, ScramblerView view) {
        this.model = model;
        this.view = view;
        handleEvents();
    }

    private void handleEvents() {
        view.getBtnScramble().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setTekst(view.getTaScramble().getText());
                model.scramble();
                updateView();
            }
        });
    }

    private void updateView() {
        view.getTaScramble().setText(model.getTekst());
    }
}
