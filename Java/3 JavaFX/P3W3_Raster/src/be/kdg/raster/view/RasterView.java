package be.kdg.raster.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

public class RasterView extends BorderPane {
    private Canvas canvas;

    public RasterView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.canvas = new Canvas(640, 400);


    }

    private void layoutNodes() {
        this.setCenter(canvas);

    }

    void drawRaster(int rows, int columns) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double widthGC = canvas.getWidth();
        double heightGC = canvas.getHeight();
        double rowHeight = heightGC/rows;
        double colWidth = widthGC/columns;
        gc.strokeLine();
    }
}
