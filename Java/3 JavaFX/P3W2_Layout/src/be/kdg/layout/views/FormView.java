package be.kdg.layout.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

/**
 * @author Bryan de Ridder
 * @version 1.0 07-02-17 10:02
 */
public class FormView extends BorderPane {
    public static final int LABEL_MIN_WIDTH = 100;
    public static final int INPUT_NODE_MIN_WIDTH = 100;
    public static final int NODE_MIN_HEIGHT = 30;
    public static final int FORM_PADDING = 20;
    private static final double BUTTON_WIDTH = 70f;
    private static final double PREF_WIDTH = Integer.MAX_VALUE;

    private Label lblNaam;
    private Label lblVoorNaam;
    private Label lblGeslacht;
    private Label lblNationaliteit;
    private Label lblLeeftijd;
    private Label lblOpmerkingen;

    private TextField tfNaam;
    private TextField tfVoorNaam;
    private TextArea taOpmerkingen;
    private RadioButton rbMan;
    private RadioButton rbVrouw;
    private ComboBox<String> cbNationaliteit;
    private Slider slLeeftijd;
    private CheckBox ckAkkoord;
    private Button btnSave;
    private Button btnClear;
    private MenuItem miExit;
    private MenuItem miAbout;
    private Label lblStatus;

    public FormView() {
        initialiseNodes();
        updateView();
    }

    private void initialiseNodes() {
        miExit = new MenuItem("Exit");
        miAbout = new MenuItem("About");
        this.lblNaam = new Label("Naam: ");
        lblNaam.setMinWidth(LABEL_MIN_WIDTH);
        this.tfNaam = new TextField();
        tfNaam.setMinWidth(INPUT_NODE_MIN_WIDTH);
        tfNaam.setPrefWidth(PREF_WIDTH);

        this.lblVoorNaam = new Label("Voornaam: ");
        lblVoorNaam.setMinWidth(LABEL_MIN_WIDTH);
        this.tfVoorNaam = new TextField();
        tfVoorNaam.setPrefWidth(PREF_WIDTH);


        this.lblGeslacht = new Label("Geslacht: ");
        lblGeslacht.setMinWidth(LABEL_MIN_WIDTH);

        this.rbMan = new RadioButton("Man");
        this.rbVrouw = new RadioButton("Vrouw");
        ToggleGroup toggleGroup = new ToggleGroup();
        rbMan.setToggleGroup(toggleGroup);
        rbVrouw.setToggleGroup(toggleGroup);

        this.lblNationaliteit = new Label("Nationaliteit: ");
        lblNationaliteit.setMinWidth(LABEL_MIN_WIDTH);
        this.cbNationaliteit = new ComboBox<>();
        cbNationaliteit.setPrefWidth(PREF_WIDTH);
        ObservableList<String> landen = FXCollections.observableArrayList(
                "België", "Nederland", "Duitsland", "Japan", "Spanje", "Italië");
        this.cbNationaliteit.setItems(landen);
        this.cbNationaliteit.getSelectionModel().select(0);

        this.lblLeeftijd = new Label("Leeftijd: ");
        lblLeeftijd.setMinWidth(LABEL_MIN_WIDTH);
        this.slLeeftijd = new Slider(18F, 70F, 18F);
        slLeeftijd.setShowTickLabels(true);
        slLeeftijd.setShowTickMarks(true);
        slLeeftijd.setMajorTickUnit(10);
        slLeeftijd.setBlockIncrement(10);
        slLeeftijd.setPrefWidth(PREF_WIDTH);

        this.ckAkkoord = new CheckBox("Ik ga akkoord met de algemene voorwaarden.");
        ckAkkoord.setMinWidth(LABEL_MIN_WIDTH);

        this.lblOpmerkingen = new Label("Opmerkingen:");
        this.taOpmerkingen = new TextArea();
        taOpmerkingen.setPrefWidth(PREF_WIDTH);

        this.btnSave = new Button("Save");
        btnSave.setPrefWidth(BUTTON_WIDTH);
        this.btnClear = new Button("Clear");
        btnClear.setPrefWidth(BUTTON_WIDTH);
        lblStatus = new Label("Formulier nog niet opgeslagen");
        lblStatus.setBackground(new Background(
                new BackgroundFill(Color.LIGHTGREY, CornerRadii.EMPTY, Insets.EMPTY)));
        lblStatus.setPrefWidth(PREF_WIDTH);
        lblStatus.setPadding(new Insets(2, 2, 2, 5));

    }

    private void updateView() {
        Menu menu = new Menu("File");
        menu.getItems().addAll(miAbout,miExit);
        MenuBar menuBar = new MenuBar(menu);
        this.setTop(menuBar);

        BorderPane bpCenter = new BorderPane();
        HBox hBoxNaam = new HBox(10, lblNaam, tfNaam);
        hBoxNaam.setMinHeight(NODE_MIN_HEIGHT);
        HBox hBoxVoorNaam = new HBox(10, lblVoorNaam, tfVoorNaam);
        hBoxVoorNaam.setMinHeight(NODE_MIN_HEIGHT);
        HBox hBoxGeslacht = new HBox(10, lblGeslacht, rbMan, rbVrouw);
        hBoxGeslacht.setMinHeight(NODE_MIN_HEIGHT);
        HBox hBoxNationaliteit = new HBox(10, lblNationaliteit, cbNationaliteit);
        hBoxNationaliteit.setMinHeight(NODE_MIN_HEIGHT);
        HBox hBoxLeeftijd = new HBox(10, lblLeeftijd, slLeeftijd);
        hBoxLeeftijd.setMinHeight(NODE_MIN_HEIGHT);
        HBox hBoxAkkoord = new HBox(10, ckAkkoord);
        hBoxAkkoord.setMinHeight(NODE_MIN_HEIGHT);

        HBox hBoxOpmerk = new HBox(10, lblOpmerkingen);

        VBox vBox = new VBox(10, hBoxNaam, hBoxVoorNaam, hBoxGeslacht, hBoxNationaliteit,
                hBoxLeeftijd, hBoxAkkoord, hBoxOpmerk);

        bpCenter.setPadding(new Insets(FORM_PADDING));
        bpCenter.setTop(vBox);

        bpCenter.setMaxWidth(325);
        HBox hBoxOpmerkfield = new HBox(taOpmerkingen);
        hBoxOpmerkfield.setMargin(taOpmerkingen, new Insets(10, 0, 10, 0));
        bpCenter.setCenter(hBoxOpmerkfield);

        HBox hBoxButtons = new HBox(10, btnSave, btnClear);
        hBoxButtons.setAlignment(Pos.BOTTOM_RIGHT);
        bpCenter.setBottom(hBoxButtons);
        this.setCenter(bpCenter);
        this.setBottom(lblStatus);
        this.setMaxWidth(325);
    }

    Button getBtnSave() {
        return btnSave;
    }

    Button getBtnClear() {
        return btnClear;
    }

    TextField getTfNaam() {
        return tfNaam;
    }

    TextField getTfVoorNaam() {
        return tfVoorNaam;
    }

    TextArea getTaOpmerkingen() {
        return taOpmerkingen;
    }

    RadioButton getRbMan() {
        return rbMan;
    }

    RadioButton getRbVrouw() {
        return rbVrouw;
    }

    ComboBox<String> getCbNationaliteit() {
        return cbNationaliteit;
    }

    Slider getSlLeeftijd() {
        return slLeeftijd;
    }

    CheckBox getCkAkkoord() {
        return ckAkkoord;
    }

    MenuItem getMiExit() {
        return miExit;
    }

    MenuItem getMiAbout() {
        return miAbout;
    }
}
