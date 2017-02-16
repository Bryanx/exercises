package be.kdg.engels.view;

import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;

public class EngelsView extends BorderPane {
    private PieChart taart;

    public EngelsView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.taart = new PieChart();
    }

    private void layoutNodes() {
        this.setCenter(taart);
    }

    PieChart getTaart() {
        return taart;
    }
}
