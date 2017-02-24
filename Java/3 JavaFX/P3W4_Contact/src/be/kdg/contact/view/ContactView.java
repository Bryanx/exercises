package be.kdg.contact.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class ContactView extends GridPane {
    private Label naamLabel;
    private Label voornaamLabel;
    private Label emailLabel;
    private Label berichtLabel;
    private TextField naamInput;
    private TextField voornaamInput;
    private TextField emailInput;
    private TextArea berichtInput;
    private Button verzendButton;

    public ContactView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.naamLabel = new Label("Naam");
        this.voornaamLabel = new Label("Voornaam");
        this.emailLabel = new Label("Email");
        this.berichtLabel = new Label("Bericht");
        this.naamInput = new TextField();
        this.voornaamInput = new TextField();
        this.emailInput = new TextField();
        this.berichtInput = new TextArea();
        this.verzendButton = new Button("Verzenden");
    }

    private void layoutNodes() {
        this.setPadding(new Insets(10.0, 10.0, 10.0, 10.0));
        this.setHgap(20.0);
        this.setVgap(10.0);

        GridPane.setConstraints(this.naamLabel, 0, 0, 1, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.naamLabel, 0, 0);

        GridPane.setConstraints(this.naamInput, 1, 0, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.naamInput, 1, 0);

        GridPane.setConstraints(this.voornaamLabel, 0, 1, 1, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.voornaamLabel, 0, 1);

        GridPane.setConstraints(this.voornaamInput, 1, 1, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.voornaamInput, 1, 1);

        GridPane.setConstraints(this.emailLabel, 0, 2, 1, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.emailLabel, 0, 2);

        GridPane.setConstraints(this.emailInput, 1, 2, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.emailInput, 1, 2);

        GridPane.setConstraints(this.berichtLabel, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.berichtLabel, 0, 3);

        GridPane.setConstraints(this.berichtInput, 0, 4, 2, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(this.berichtInput, 0, 4);

        GridPane.setConstraints(this.verzendButton, 0, 5, 2, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.verzendButton, 0, 5);
    }

    Button getVerzendButton() {
        return this.verzendButton;
    }

    TextField getNaamInput() {
        return naamInput;
    }

    TextField getVoornaamInput() {
        return voornaamInput;
    }

    TextField getEmailInput() {
        return emailInput;
    }

    TextArea getBerichtInput() {
        return berichtInput;
    }
}
