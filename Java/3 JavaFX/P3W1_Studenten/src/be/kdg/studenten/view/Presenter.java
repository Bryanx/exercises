package be.kdg.studenten.view;

import be.kdg.studenten.model.StudentAdministratie;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Bryan de Ridder
 * @version 1.0 03-02-17 10:50
 */
public class Presenter {
    private StudentAdministratie model;
    private StudentView view;
    private boolean nextStudent;
    private int counter = 0;


    public Presenter(StudentAdministratie model, StudentView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getBtnVolgende().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nextStudent = true;
                updateView();
            }
        });
        view.getBtnVorige().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nextStudent = false;
                updateView();
            }
        });
    }

    private void updateView() {
        if (nextStudent) {
            if (counter >= model.getStudenten().size()-1) {
                counter = 0;
            } else counter++;
        } else {
            if (counter <= 0) {
                counter = model.getStudenten().size()-1;
            } else counter--;
        }
        view.getTfNaam().setText(model.getStudenten().get(counter).getNaam());
        view.getTfVoornaam().setText(model.getStudenten().get(counter).getVoornaam());
        view.getTfNummer().setText(String.valueOf(model.getStudenten().get(counter).getNummer()));
        view.getTfKlas().setText(model.getStudenten().get(counter).getKlas());
    }
}
