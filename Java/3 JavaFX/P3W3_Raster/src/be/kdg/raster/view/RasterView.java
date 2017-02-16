package be.kdg.raster.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RasterView extends BorderPane {
    private Canvas canvas;
    private Slider slRows;
    private Slider slColumns;
    private Label lblRows;
    private Label lblColumns;

    public RasterView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.canvas = new Canvas(640, 400);
        this.slRows = new Slider();
        slRows.setShowTickMarks(true);
        slRows.setMin(2);
        slRows.setMax(100);
        slRows.setShowTickLabels(true);
        this.slColumns = new Slider();
        slColumns.setShowTickMarks(true);
        slColumns.setMin(2);
        slColumns.setMax(100);
        slColumns.setShowTickLabels(true);
        this.lblRows = new Label("rijen");
        this.lblColumns = new Label("kolommen");
    }

    private void layoutNodes() {
        this.setCenter(canvas);
        VBox vbox = new VBox(lblRows, slRows, lblColumns, slColumns);
        this.setBottom(vbox);

    }

    void drawRaster(int rows, int columns) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double widthGC = canvas.getWidth();
        double heightGC = canvas.getHeight();
        double rowHeight = heightGC/rows;
        double colWidth = widthGC/columns;

        gc.setFill(Color.WHITE);
        gc.fillRect(0,0,widthGC,heightGC);

        for (int i = 1; i < 100; i++) {
            gc.strokeLine(colWidth*i,0, colWidth*i,heightGC);
            gc.strokeLine(0,rowHeight*i, widthGC,rowHeight*i);
        }
    }

    Slider getSlRows() {
        return slRows;
    }

    Slider getSlColumns() {
        return slColumns;
    }
}
