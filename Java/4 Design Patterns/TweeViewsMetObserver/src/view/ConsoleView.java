package view;

import model.AModel;
import model.BModel;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/10/17 15:00
 */
public class ConsoleView implements Observer {

    private AModel aModel;
    private BModel bModel;

    public ConsoleView(AModel aModel, BModel bModel) {
        this.aModel = aModel;
        this.bModel = bModel;
        aModel.addObserver(this);
        bModel.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
