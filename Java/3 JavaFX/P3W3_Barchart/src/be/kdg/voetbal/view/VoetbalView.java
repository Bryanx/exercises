package be.kdg.voetbal.view;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.BorderPane;

public class VoetbalView extends BorderPane {
    private BarChart<String, Number> barchart;


    public VoetbalView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        this.barchart = new BarChart<>(xAxis,yAxis);

    }

    private void layoutNodes() {
        this.setCenter(barchart);

    }

    BarChart<String, Number> getBarchart() {
        return barchart;
    }
}
