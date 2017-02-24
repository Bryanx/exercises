package be.kdg.contact.view;

import be.kdg.contact.model.Messenger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ContactPresenter {
    private final Messenger model;
    private final ContactView view;

    public ContactPresenter(Messenger model, ContactView view) {
        this.model = model;
        this.view = view;

        addEventHandlers();
    }

    private void addEventHandlers() {
        this.view.getVerzendButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                final String naam = view.getNaamInput().getText();
                final String voornaam = view.getVoornaamInput().getText();
                final String email = view.getEmailInput().getText();
                final String bericht = view.getBerichtInput().getText();
                model.send(naam, voornaam, email, bericht);
                view.getNaamInput().clear();
                view.getVoornaamInput().clear();
                view.getEmailInput().clear();
                view.getBerichtInput().clear();
            }
        });
    }

    /*private void updateView() {

    }*/
}
