package be.kdg.ssp.view;

import be.kdg.ssp.model.*;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

public class SSPTransition extends Transition {
    private final SSPEngine modelz;
    private final SSPView viewz;

    public SSPTransition(SSPEngine model, SSPView view) {
        this.modelz = model;
        this.viewz = view;

        // Hier aanvullen...
        setCycleDuration(Duration.seconds(3));

        setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                viewz.getTextField().setText(String.valueOf(modelz.play()));
                viewz.getTextField().setTextFill(SSPView.STANDARD_COLOR);
                viewz.getPlayButton().setDisable(false);
            }
        });
    }

    @Override
    protected void interpolate(double frac) {
        // Hier aanvullen...
        if (frac <= 0.33) {
            viewz.getTextField().setText("3");
        } else if (frac <= 0.66) {
            viewz.getTextField().setText("2");
        } else if (frac <= 1.0) {
            viewz.getTextField().setText("1");
        }
    }
}
