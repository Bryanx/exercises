package be.kdg.voetbal.view;

import be.kdg.voetbal.model.VoetbalModel;
import javafx.scene.chart.XYChart;

public class Presenter {
    private final VoetbalModel model;
    private final VoetbalView view;

    public Presenter(VoetbalModel model, VoetbalView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
    }

    private void updateView() {
        view.getBarchart().getXAxis().setLabel("Geboortekwartaal.");
        XYChart.Series<String, Number> mijnSerie = new XYChart.Series<>();
        mijnSerie.setName("Bevolking België");
        for (String kwartalen : VoetbalModel.KWARTALEN) {
            for (Double geboortes : VoetbalModel.GEBOORTES_BELGIE) {
                mijnSerie.getData().add(new XYChart.Data<>(kwartalen, geboortes));
            }
        }
        XYChart.Series<String, Number> mijnTweedeSerie = new XYChart.Series<>();
        mijnSerie.setName("Spelers in eerste klasse");
        for (String kwartalen : VoetbalModel.KWARTALEN) {
            for (int geboortes : VoetbalModel.SPELERS_EERSTE_KLASSE) {
                mijnTweedeSerie.getData().add(new XYChart.Data<>(kwartalen, geboortes));
            }
        }
        XYChart.Series<String, Number> mijnDerdeSerie = new XYChart.Series<>();
        mijnDerdeSerie.setName("Spelers in nationale selectie");
        for (String kwartalen : VoetbalModel.KWARTALEN) {
            for (int geboortes : VoetbalModel.SPELERS_NAT_SELECTIE) {
                mijnDerdeSerie.getData().add(new XYChart.Data<>(kwartalen, geboortes));
            }
        }
        view.getBarchart().getData().addAll(mijnSerie,mijnTweedeSerie,mijnDerdeSerie);

    }
}
