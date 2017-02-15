package be.kdg.layout.views;

import be.kdg.layout.models.FormModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 * @author Bryan de Ridder
 * @version 1.0 07-02-17 10:03
 */
public class FormPresenter {
    private FormModel model;
    private FormView view;

    public FormPresenter(FormModel model, FormView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
        view.getBtnSave().setDisable(true);
    }
    private void addEventHandlers() {
        view.getBtnClear().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clearLabels();
            }
        });
        view.getBtnSave().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setNaam(view.getTfNaam().getText());
                model.setVoorNaam(view.getTfVoorNaam().getText());
                if (view.getRbMan().isSelected()) {
                    model.setGeslacht(FormModel.Geslacht.MAN);
                } else {
                    model.setGeslacht(FormModel.Geslacht.VROUW);
                }
                model.setLeeftijd((int)view.getSlLeeftijd().getValue());
                model.setNationaliteit(view.getCbNationaliteit().getValue());
                model.setAkkoord(view.getCkAkkoord().isSelected());
                model.setOpmerkingen(view.getTaOpmerkingen().getText());
                model.save();
            }
        });
        view.getCkAkkoord().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (view.getCkAkkoord().isSelected()) {
                    view.getBtnSave().setDisable(false);
                } else {
                    view.getBtnSave().setDisable(true);
                }
            }
        });
        view.getMiAbout().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION,
                        "Allowkes", ButtonType.OK);
                alert.showAndWait();
            }
        });
        view.getMiExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
    }

    private void clearLabels() {
        view.getTfNaam().clear();
        view.getTfVoorNaam().clear();
        view.getCkAkkoord().setSelected(false);
        view.getRbMan().setSelected(false);
        view.getRbVrouw().setSelected(false);
        view.getTaOpmerkingen().clear();
        view.getSlLeeftijd().setValue(0);
    }

    private void updateView() {
    }
}
