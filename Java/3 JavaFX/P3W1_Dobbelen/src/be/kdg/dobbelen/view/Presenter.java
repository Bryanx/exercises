package be.kdg.dobbelen.view;

import be.kdg.dobbelen.model.Dobbelen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class Presenter {
    private Dobbelen model;
    private DobbelenView view;

    public Presenter(Dobbelen model, DobbelenView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        //TODO
        view.getBtnDobbel().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.werp();
                updateView();
            }
        });
    }

    private void updateView() {
        view.getDobbel1().setImage(
                new Image("be/kdg/dobbelen/view/images/die" + model.getAantalOgen1() + ".png"));
        view.getDobbel2().setImage(
                new Image("be/kdg/dobbelen/view/images/die" + model.getAantalOgen2() + ".png"));

    }
}
