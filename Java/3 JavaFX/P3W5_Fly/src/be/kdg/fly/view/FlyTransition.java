package be.kdg.fly.view;

import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.geometry.Insets;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.util.Duration;

public class FlyTransition extends Transition {
    private final FlyPane view;
    private int previousImageNumber;

    public FlyTransition(FlyPane view) {
        this.view = view;
        this.previousImageNumber = 0; // Starten op 0 zodat er onmiddellijk getekend wordt

        // Hier aanvullen...
        this.setCycleDuration(Duration.millis(450));
        this.setCycleCount(INDEFINITE);
        this.setAutoReverse(true);
    }

    @Override
    protected void interpolate(double frac) {
        // Hier aanvullen...
        final int imageNumber = (int) (frac * 5 + 1);

        if (imageNumber != previousImageNumber) {
            GraphicsContext gc = this.view.getCanvas().getGraphicsContext2D();
            gc.setFill(Color.BLUE);

            final double canvasWidth;
            final double canvasHeight;
            final WingManImage frame = WingManImage.get(imageNumber);
            if (frame != null) {
                final double imageWidth = frame.getImage().getWidth();
                final double imageHeight = frame.getImage().getHeight();

//                gc.fillRect(0.0,0.0, canvasWidth, canvasHeight);
//                gc.drawImage();
            }
        }
//        view.getCanvas().getGraphicsContext2D().drawImage(img, 15, view.getHeight()/4);
    }
}
