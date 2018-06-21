package be.kdg.patterns;

// Zie http://stackoverflow.com/questions/27433899/spinner-control-value

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class SpinnerDemo extends Application {
    private final Spinner<Integer> spinner = new Spinner<>();

    @Override
    public void start(Stage primaryStage) {
        // Op de volgende regel vind je de factory
        SpinnerValueFactory<Integer> factory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
        spinner.setValueFactory(factory);
        spinner.setEditable(true);
        spinner.setPrefWidth(80);

        // Commit on TAB
        spinner.addEventFilter(KeyEvent.ANY, e -> {
            if (spinner.isEditable() && e.getCode().equals(KeyCode.TAB)) {
                doCommit();
                e.consume();
            }
        });

        // Override Commit on ENTER
        spinner.getEditor().setOnAction(e -> {
            if (spinner.isEditable()) {
                doCommit();
                e.consume();
            }
        });

        Scene scene = new Scene(new StackPane(spinner), 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*
        Commit new value, checking conversion to integer,
        restoring old valid value in case of exception
    */
    private void doCommit() {
        String text = spinner.getEditor().getText();
        SpinnerValueFactory<Integer> valueFactory = spinner.getValueFactory();
        if (valueFactory != null) {
            StringConverter<Integer> converter = valueFactory.getConverter();
            if (converter != null) {
                try {
                    Integer value = converter.fromString(text);
                    valueFactory.setValue(value);
                } catch (NumberFormatException nfe) {
                    spinner.getEditor().setText(converter.toString(valueFactory.getValue()));
                }
            }
        }
    }
}