package be.kdg.filldemo.view;

import javafx.animation.FillTransition;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 14:54
 */
public class FillView extends Group {

    private Rectangle rectangle;
    private Circle circle;
    private Label label;

    public FillView() {
        initialiseNodes();
        layoutNodes();
        animate();
    }

    private void initialiseNodes() {
        Stop[] stops = new Stop[]{
                new Stop(0, Color.BLUE),
                new Stop(1, Color.DARKBLUE)
        };
        LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops);

        rectangle = new Rectangle(300, 300);
        rectangle.setFill(gradient);

        circle = new Circle();
        circle.setRadius(100);
        circle.setFill(Color.YELLOW);
        circle.setCenterX(150);
        circle.setCenterY(150);

        label = new Label("Van geel naar oranje en omgekeerd");
        label.setPadding(new Insets(20));
        label.setTextFill(Color.WHITE);
    }

    private void layoutNodes() {
        getChildren().addAll(rectangle, circle, label);
    }

    private void animate() {
        FillTransition transition = new FillTransition();
        transition.setShape(circle);
        transition.setDuration(new Duration(2000));
        transition.setToValue(Color.ORANGE);
        transition.setCycleCount(Timeline.INDEFINITE);
        transition.setAutoReverse(true);
        transition.play();
    }
}
