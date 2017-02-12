package be.kdg.rekenmachine.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import java.util.ArrayList;
import java.util.List;

public class CalculatorPane extends GridPane {
    private static final int PADDING = 5;
    private List<Button> buttons;
    private TextField tfCalculator;


    public CalculatorPane() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.buttons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buttons.add(new Button(String.valueOf(i)));
        }

        tfCalculator = new TextField();
        tfCalculator.setAlignment(Pos.CENTER_RIGHT);

        String[] operators = { "+","-",":","x",",","C","=" };
        for (String ops : operators) {
            buttons.add(new Button(ops));
        }
    }

    private void layoutNodes() {
        this.add(buttons.get(0),0,4); //Number 0
        int j = 0, k = 3;
        for (int i = 1; i <= 9; i++) {
            this.add(buttons.get(i),j,k); //Number 1 to 9
            j++; if (j==3) {j=0; k--;}
        }
        this.add(tfCalculator,0,0,5,1); //TextField
        this.add(buttons.get(10),3,4); //Plus
        this.add(buttons.get(11),3,3); //Minus
        this.add(buttons.get(12),3,1); //Divide
        this.add(buttons.get(13),3,2); //Multiply
        this.add(buttons.get(14),1,4,2,1); //Comma
        this.add(buttons.get(15),4,1); //Clear
        this.add(buttons.get(16),4,2,1,3); //Equals

        for (Control node : buttons) {
            setHgrow(node, Priority.ALWAYS);
            setVgrow(node, Priority.ALWAYS);
            node.setMinSize(35,35);
            node.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        }
        this.setVgap(PADDING);
        this.setHgap(PADDING);
        this.setPadding(new Insets(PADDING*2));
    }

    Button getButton(int index) {
        return buttons.get(index);
    }

    TextField getTfCalculator() {
        return tfCalculator;
    }
}