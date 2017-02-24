package be.kdg.mailinglist.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class MailingListView extends GridPane {
    private Label emailLabel;
    private TextField emailTextField;
    private Button voegtoe;
    private ListView<String> list;
    private Button verwijder;
    private Button opslaan;

    public MailingListView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.emailLabel = new Label("E-mailadres");
        this.emailTextField = new TextField();
        this.voegtoe = new Button("Voeg toe >>");
        this.list = new ListView<>();
        this.verwijder = new Button("Verwijder");
        this.opslaan = new Button("Opslaan");

        this.list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        this.voegtoe.setDisable(true);
    }

    private void layoutNodes() {
        this.setPadding(new Insets(15.0));
        this.setHgap(15.0);
        this.setVgap(15.0);

        GridPane.setConstraints(this.emailLabel, 0, 0, 1, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.emailLabel, 0, 0);
        GridPane.setConstraints(this.emailTextField, 1, 0, 1, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.emailTextField, 1, 0);
        GridPane.setConstraints(this.voegtoe, 0, 1, 2, 2, HPos.CENTER, VPos.TOP, Priority.NEVER, Priority.ALWAYS);
        this.add(this.voegtoe, 0, 1);

        GridPane.setConstraints(this.list, 2, 0, 1, 2, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(this.list, 2, 0);
        this.verwijder.setMaxWidth(Double.MAX_VALUE);
        GridPane.setConstraints(this.verwijder, 2, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.verwijder, 2, 2);

        this.opslaan.setPrefWidth(200.0);
        GridPane.setConstraints(this.opslaan, 0, 3, 3, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.opslaan, 0, 3);
    }

    Button getVoegtoe() {
        return this.voegtoe;
    }

    TextField getEmailTextField() {
        return this.emailTextField;
    }

    ListView<String> getList() {
        return this.list;
    }

    Button getVerwijder() {
        return this.verwijder;
    }

    Button getOpslaan() {
        return this.opslaan;
    }
}
