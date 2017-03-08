package be.kdg.studenten.view;

import be.kdg.studenten.model.Student;
import be.kdg.studenten.model.StudentAdministratie;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Presenter {
    private final StudentAdministratie model;
    private final StudentView view;

    private int currentStudent;

    public Presenter(StudentAdministratie model, StudentView view) {
        this.model = model;
        this.view = view;
        currentStudent = 0;

        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getBtnVorige().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                currentStudent--;
                updateView();
            }
        });

        view.getBtnVolgende().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                currentStudent++;
                updateView();
            }
        });
    }

    private void updateView() {
        if (currentStudent == 0) {
            view.getBtnVorige().setDisable(true);
        }
        else {
            view.getBtnVorige().setDisable(false);
        }

        if (currentStudent == this.model.getStudenten().size() - 1) {
            view.getBtnVolgende().setDisable(true);
        }
        else {
            view.getBtnVolgende().setDisable(false);
        }

        final Student student = model.getStudenten().get(currentStudent);
        view.getTfNaam().setText(student.getNaam());
        view.getTfVoornaam().setText(student.getVoornaam());
        view.getTfNummer().setText(String.valueOf(student.getNummer()));
        view.getTfKlas().setText(student.getKlas());
    }
}
