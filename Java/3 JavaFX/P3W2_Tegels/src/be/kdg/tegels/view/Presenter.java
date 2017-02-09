package be.kdg.tegels.view;

import be.kdg.tegels.model.TileModel;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Presenter {
    private final TileModel model;
    private final TileView view;

    private int currentHoverColumn;
    private int currentHoverRow;

    public Presenter(TileModel model, TileView view) {
        this.model = model;
        this.view = view;

        this.currentHoverColumn = -1;
        this.currentHoverRow = -1;

        this.addEventHandlers();
        this.updateView();
    }

    private int translateXToColumn(final double x) {
        final double width = this.view.getCanvas().getWidth();
        final int columnResult = (int)(x / width * TileModel.COLUMNS);
        if (columnResult >= 0 && columnResult < TileModel.COLUMNS) {
            return columnResult;
        }
        else {
            return -1;
        }
    }

    private int translateYToRow(final double y) {
        final double height = this.view.getCanvas().getHeight();
        final int rowResult = (int)(y / height * TileModel.ROWS);
        if (rowResult >= 0 && rowResult < TileModel.ROWS) {
            return rowResult;
        }
        else {
            return -1;
        }
    }

    private void addEventHandlers() {
        view.getCanvas().setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                currentHoverColumn = translateXToColumn(event.getX());
                currentHoverRow = translateYToRow(event.getY());
                updateView();
            }
        });
        view.getCanvas().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.setSelectedTile(
                        translateXToColumn(event.getX()),
                        translateYToRow(event.getY()));
                updateView();
            }
        });
        view.getCanvas().setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                currentHoverColumn = -1;
                currentHoverRow = -1;
                updateView();
            }
        });
    }

    private void updateView() {
        view.displayCurrentTiles(
                currentHoverColumn,
                currentHoverRow,
                model.getSelectedTileColumn(),
                model.getSelectedTileRow());
    }
}
