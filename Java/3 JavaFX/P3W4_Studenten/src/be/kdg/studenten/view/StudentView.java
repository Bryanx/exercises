package be.kdg.studenten.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class StudentView extends GridPane {
    private Label lblNaam = new Label("Naam");
    private Label lblVoornaam = new Label("Voornaam");
    private Label lblNummer = new Label("Nummer");
    private Label lblKlas = new Label("Klase");
    private TextField tfNaam = new TextField();
    private TextField tfVoornaam = new TextField();
    private TextField tfNummer = new TextField();
    private TextField tfKlas = new TextField();
    private Button btnVolgende = new Button("Volgende");
    private Button btnVorige = new Button("Vorige");

    public StudentView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        tfKlas.setEditable(false);
        tfNaam.setEditable(false);
        tfNummer.setEditable(false);
        tfVoornaam.setEditable(false);
    }

    private void layoutNodes() {
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));
        add(lblNaam, 0, 0);
        add(tfNaam, 1, 0);
        add(lblVoornaam, 0, 1);
        add(tfVoornaam, 1, 1);
        add(lblNummer, 0, 2);
        add(tfNummer, 1, 2);
        add(lblKlas, 0, 3);
        add(tfKlas, 1, 3);
        add(btnVorige, 0, 4);
        add(btnVolgende, 1, 4);
        GridPane.setHalignment(btnVolgende, HPos.LEFT);
        GridPane.setHalignment(btnVorige, HPos.RIGHT);
    }

    Button getBtnVorige() {
        return this.btnVorige;
    }

    Button getBtnVolgende() {
        return this.btnVolgende;
    }

    TextField getTfNaam() {
        return tfNaam;
    }

    TextField getTfVoornaam() {
        return tfVoornaam;
    }

    TextField getTfNummer() {
        return tfNummer;
    }

    TextField getTfKlas() {
        return tfKlas;
    }
}
