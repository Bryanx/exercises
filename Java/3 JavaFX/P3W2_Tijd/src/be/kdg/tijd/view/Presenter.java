package be.kdg.tijd.view;

import be.kdg.tijd.model.TimeModel;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Presenter {
    private TimeModel model;
    private TimeView view;

    public Presenter(TimeModel model, TimeView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getSlider().setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double tijd = view.getSlider().getValue();
                int uren = (int) tijd;
                double mins = tijd % uren * 60;
                model.setCurrentTime(LocalTime.of(uren, (int) mins));
                updateView();
            }
        });
    }

    private void updateView() {
        view.applyDaylightSun(
                model.getDaylightPercentage(),
                model.getSunHeight(),
                model.getSunPositionX());
        int uren = model.getCurrentTime().getHour();
        int minuten = model.getCurrentTime().getMinute() / 60;
        double tijd = uren + minuten;
        view.getSlider().setValue(tijd);
    }
}
