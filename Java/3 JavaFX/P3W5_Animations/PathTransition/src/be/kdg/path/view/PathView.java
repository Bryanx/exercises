package be.kdg.path.view;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 18:17
 */
public class PathView extends Group {
    private Circle circle;
    Path path;

    public PathView() {
        initialiseNodes();
        layoutNodes();
        animate();
    }

    private void initialiseNodes() {
        QuadCurveTo quadCurveTo = new QuadCurveTo();
        quadCurveTo.setX(620);
        quadCurveTo.setY(460);
        quadCurveTo.setControlX(320);
        quadCurveTo.setControlY(0);

        circle = new Circle(10, Color.LIGHTCORAL);
        path = new Path();
        path.getElements().addAll(new MoveTo(20, 460), quadCurveTo);
        path.setFill(null);
        path.setStrokeWidth(0);
    }

    private void layoutNodes() {
        getChildren().addAll(circle, path);
    }

    private void animate() {
        PathTransition transition = new PathTransition(Duration.seconds(4), path, circle);
        transition.setCycleCount(Animation.INDEFINITE);
        transition.setAutoReverse(false);
        transition.play();
    }
}
