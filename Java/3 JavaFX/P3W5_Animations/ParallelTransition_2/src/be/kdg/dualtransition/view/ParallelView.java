package be.kdg.dualtransition.view;

import javafx.animation.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 16:28
 */
public class ParallelView extends Group {
    private Rectangle rectangle;

    public ParallelView() {
        initialiseNodes();
        layoutNodes();
        animate();
    }

    private void initialiseNodes() {
        rectangle = new Rectangle(100, 100, 100, 100);
        rectangle.setFill(Color.BLUE);
    }

    private void layoutNodes() {
        getChildren().add(rectangle);
    }

    private void animate() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2.5));
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(5));
        rotateTransition.setByAngle(180.0);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.setAutoReverse(true);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(5));
        scaleTransition.setByX(0.5);
        scaleTransition.setByY(0.5);
        scaleTransition.setCycleCount(Animation.INDEFINITE);
        scaleTransition.setAutoReverse(true);

        FillTransition fillTransition = new FillTransition(Duration.seconds(5));
        fillTransition.setToValue(Color.ORANGE);
        fillTransition.setCycleCount(Timeline.INDEFINITE);
        fillTransition.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition(rectangle,
                fadeTransition, rotateTransition, scaleTransition, fillTransition);
        parallelTransition.play();
    }
}
