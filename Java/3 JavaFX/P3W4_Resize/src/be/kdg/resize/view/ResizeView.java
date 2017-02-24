package be.kdg.resize.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class ResizeView extends BorderPane {
    private Canvas canvas;

    public ResizeView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        canvas = new Canvas();
    }

    private void layoutNodes() {
        setCenter(canvas);
    }

    @Override
    public void resize(double width, double height) {
        super.resize(width, height);

        canvas.setWidth(width);
        canvas.setHeight(height);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.rgb(
                (int) (width / 1400 * 256) % 256,
                (int) (height / 1000 * 256) % 256,
                0));
        gc.fillRect(0.0, 0.0, canvas.getWidth(), canvas.getHeight());
    }
}
