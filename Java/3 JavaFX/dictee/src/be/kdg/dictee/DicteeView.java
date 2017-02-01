package be.kdg.dictee;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Bryan de Ridder
 * @version 1.0 31-01-17 12:09
 */
public class DicteeView extends BorderPane {
    private Button btnDictee;
    private TextArea taDictee;

    public DicteeView() {
        btnDictee = new Button("Lees voor");

        btnDictee.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Voice voice = VoiceManager.getInstance().getVoice("kevin16");
                voice.allocate();
                voice.speak(taDictee.getText());
                voice.deallocate();
            }
        });

        taDictee = new TextArea();
        this.setCenter(taDictee);
        this.setBottom(btnDictee);
        setAlignment(btnDictee, Pos.CENTER);
        setMargin(btnDictee, new Insets(10, 10, 20, 10));
        setMargin(taDictee, new Insets(20, 20, 0, 20));
    }

}
