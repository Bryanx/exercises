package be.kdg.rekenmachine.view;

import be.kdg.rekenmachine.model.Calculator;
import be.kdg.rekenmachine.model.CalculatorException;
import be.kdg.rekenmachine.model.OperandCharacter;
import be.kdg.rekenmachine.model.Operator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Presenter {
    private Calculator model;
    private CalculatorPane view;

    public Presenter(Calculator model, CalculatorPane view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }
    private void addEventHandlers() {
        for (int i = 0; i <= 16; i++) {
            view.getButton(i).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    String target = event.getTarget().toString();
                    String operator = target.substring(target.length()-2, target.length()-1);
                    String[] numNames = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
                    try {
                        switch (operator){
                            case "+" : model.handleInput(Operator.PLUS);break;
                            case "-" : model.handleInput(Operator.MINUS);break;
                            case ":" : model.handleInput(Operator.DIVIDE);break;
                            case "x" : model.handleInput(Operator.MULTIPLY);break;
                            case "," : model.handleInput(OperandCharacter.DECIMAL_SEPARATOR);break;
                            case "=" : model.calculate();break;
                            case "C" : model.clear();break;
                            default : model.handleInput(
                                    OperandCharacter.valueOf(numNames[Integer.parseInt(operator)]));
                        }
                    } catch (CalculatorException e) {
                        e.getMessage();
                    }
                    updateView();
                }
            });
        }
    }
    private void updateView() {
        view.getTfCalculator().setText(model.getDisplay());
    }
}
