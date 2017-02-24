package be.kdg.mailinglist.view;

import be.kdg.mailinglist.model.EmailAddress;
import be.kdg.mailinglist.model.EmailAddressVerification;
import be.kdg.mailinglist.model.MailingList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.util.List;

public class Presenter {
    private final MailingList model;
    private final MailingListView view;

    private boolean isCurrentEmailAddressValid;

    public Presenter(MailingList model, MailingListView view) {
        this.model = model;
        this.view = view;

        this.isCurrentEmailAddressValid = false;

        try {
            this.model.loadFromDisk();
        }
        catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fout");
            alert.setHeaderText("Probleem tijdens het inladen van email adressen.");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        this.view.getEmailTextField().textProperty().addListener((observable, oldValue, newValue) -> {
            if (EmailAddressVerification.isValidEmailAddress(newValue)) {
                this.isCurrentEmailAddressValid = true;
            }
            else {
                this.isCurrentEmailAddressValid = false;
            }
            Presenter.this.updateView();
        });

        final EventHandler<ActionEvent> eventHandler = event -> {
            if (!Presenter.this.view.getVoegtoe().isDisabled()) {
                Presenter.this.model.addEmailAddress(new EmailAddress(Presenter.this.view.getEmailTextField().getText()));
                this.view.getEmailTextField().clear();
                this.isCurrentEmailAddressValid = false;
                Presenter.this.updateView();
            }
        };

        this.view.getEmailTextField().setOnAction(eventHandler);
        this.view.getVoegtoe().setOnAction(eventHandler);

        this.view.getVerwijder().setOnAction(event -> {
            if (this.view.getList().getSelectionModel().getSelectedIndex() != -1) {
                Presenter.this.model.removeEmailAddress(Presenter.this.view.getList().getSelectionModel().getSelectedItem());
                Presenter.this.updateView();
            }
        });

        this.view.getOpslaan().setOnAction(event -> {
            try {
                model.saveToDisk();
            }
            catch (IOException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Fout");
                alert.setHeaderText("Probleem tijdens het opslaan van email adressen.");
                alert.setContentText(ex.getMessage());
                alert.showAndWait();
            }
        });
    }

    private void updateView() {
        final List<String> addresses = this.model.getEmailAddresses();
        this.view.getList().setItems(FXCollections.observableArrayList(addresses));
        this.view.getVerwijder().setDisable(addresses.size() == 0);
        this.view.getVoegtoe().setDisable(!this.isCurrentEmailAddressValid);
    }
}
