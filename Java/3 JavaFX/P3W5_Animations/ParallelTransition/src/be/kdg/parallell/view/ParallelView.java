package be.kdg.parallell.view;

import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


/**
 * @author Kristiaan Behiels
 * @version 1.0 6/03/2016 15:01
 */
public class ParallelView extends VBox {
    private Circle ballOne;
    private Circle ballTwo;

    public ParallelView() {
        initialiseNodes();
        layoutNodes();
        animate();
    }

    private void initialiseNodes() {
        RadialGradient gradient = new RadialGradient(
                0, 0, 0.35, 0.35, 0.5, true,
                CycleMethod.NO_CYCLE,
                new Stop(0.0, Color.WHITE),
                new Stop(1.0, Color.RED)
        );

        ballOne = new Circle(0, 0, 20);
        ballOne.setFill(gradient);

        ballTwo = new Circle(0, 0, 20);
        ballTwo.setFill(gradient);
    }

    private void layoutNodes() {
        setWidth(600);
        setHeight(480);
        getChildren().addAll(ballOne, ballTwo);
    }

    private void animate() {
        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(2), ballOne);
        transition1.setFromX(ballOne.getRadius());
        transition1.setToX(getWidth() - ballOne.getRadius());
        transition1.setFromY(getHeight() / 3);
        transition1.setToY(getHeight() / 3);
        transition1.setCycleCount(Transition.INDEFINITE);
        transition1.setAutoReverse(true);
        transition1.setInterpolator(Interpolator.EASE_BOTH);

        TranslateTransition transition2 = new TranslateTransition(Duration.seconds(2), ballTwo);
        transition2.setFromX(getWidth() - ballTwo.getRadius());
        transition2.setToX(ballOne.getRadius());
        transition2.setFromY(getHeight() / 3 * 2);
        transition2.setToY(getHeight() / 3 * 2);
        transition2.setCycleCount(Transition.INDEFINITE);
        transition2.setAutoReverse(true);
        transition2.setInterpolator(Interpolator.EASE_BOTH);

        ParallelTransition parallelTransition = new ParallelTransition(transition1, transition2);
        parallelTransition.play();
    }
}
