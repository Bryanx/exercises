package be.kdg.resize.view;

import javafx.event.EventHandler;
import javafx.geometry.Dimension2D;
import javafx.stage.WindowEvent;

public class ResizePresenter {
    private final ResizeView view;

    public ResizePresenter(ResizeView view) {
        this.view = view;
    }

    /*private void addEventHandlers() {
    }*/

    public void addWindowEventHandlers() {
        view.getScene().getWindow().setOnCloseRequest(
                new EventHandler<WindowEvent>() {
                    @Override
                    public void handle(WindowEvent event) {
                        Settings.saveWindowSize(new Dimension2D(
                                view.getScene().getWindow().getWidth(),
                                view.getScene().getWindow().getHeight()
                        ));
                    }
                }
        );

        final Dimension2D windowSize = Settings.loadWindowSize();
        view.getScene().getWindow().setWidth(windowSize.getWidth());
        view.getScene().getWindow().setHeight(windowSize.getHeight());
    }
}
