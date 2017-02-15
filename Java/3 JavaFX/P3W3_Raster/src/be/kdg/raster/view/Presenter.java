package be.kdg.raster.view;

import be.kdg.raster.model.RasterModel;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Presenter {
    private final RasterModel model;
    private final RasterView view;

    public Presenter(RasterModel model, RasterView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        view.getSlRows().setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.setRows((int)view.getSlRows().getValue());
                updateView();
            }
        });
        view.getSlColumns().setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.setColumns((int)view.getSlColumns().getValue());
                updateView();
            }
        });
    }

    private void updateView() {
        this.view.drawRaster(this.model.getRows(), this.model.getColumns());
    }
}
