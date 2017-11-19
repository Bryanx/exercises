package be.kdg.craps.view;

import be.kdg.craps.model.craps.CrapsToestand;
import be.kdg.craps.model.craps.CrapsSpel;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class CrapsPanel extends JPanel {
    private DobbelsteenComponent dobbelsteen1;
    private DobbelsteenComponent dobbelsteen2;
    private JLabel berichtLabel;
    private JButton gooiButton;
    private CrapsSpel crapsSpel;

    public CrapsPanel(CrapsSpel crapsSpel) {
        this.crapsSpel = crapsSpel;
        maakComponenten();
        layoutComponenten();
        voegListenersToe();
    }

    private void voegListenersToe() {
        gooiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gooi();
            }
        });
    }

    private void gooi() {
        dobbelsteen1.setVisible(true);
        dobbelsteen2.setVisible(true);
        crapsSpel.gooi();
        CrapsToestand toestand = crapsSpel.getToestand();
        toonToestand(toestand);
        toonDobbelstenen();
    }

    private void toonDobbelstenen() {
        dobbelsteen1.setWaarde(crapsSpel.getDobbelsteen(0));
        dobbelsteen2.setWaarde(crapsSpel.getDobbelsteen(1));
    }

    private void toonToestand(CrapsToestand toestand) {
        if (toestand == CrapsToestand.NIET_GEGOOID) {
            berichtLabel.setText("Druk op 'gooi' om te beginnen");
        } else if (toestand == CrapsToestand.GEWONNEN) {
            berichtLabel.setText("U hebt dit spel gewonnen!");
            gooiButton.setEnabled(false);
        } else if (toestand == CrapsToestand.VERLOREN) {
            berichtLabel.setText("U hebt dit spel verloren...");
            gooiButton.setEnabled(false);
        } else {
            int teGooienWaarde = crapsSpel.getTeGooienWaarde();
            berichtLabel.setText("Probeer " + teGooienWaarde + " te gooien");
        }
    }

    private void layoutComponenten() {
        setLayout(new PartitionLayout(65, PartitionLayout.VERTICAL));
        JPanel dobbelsteenPanel = new JPanel(new GridLayout(1, 2));
        dobbelsteenPanel.add(dobbelsteen1);
        dobbelsteenPanel.add(dobbelsteen2);
        add(dobbelsteenPanel);
        JPanel onderstePanel = new JPanel(new GridLayout(2, 1));
        JPanel berichtPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        berichtPanel.add(berichtLabel);
        onderstePanel.add(berichtPanel);
        JPanel knoppenPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        knoppenPanel.add(gooiButton);
        onderstePanel.add(knoppenPanel);
        add(onderstePanel);
    }

    private void maakComponenten() {
        dobbelsteen1 = new DobbelsteenComponent(1);
        dobbelsteen1.setVisible(false); //eerste keer nog niet zichtbaar
        dobbelsteen2 = new DobbelsteenComponent(2);
        dobbelsteen2.setVisible(false); //eerste keer nog niet zichtbaar
        berichtLabel = new JLabel("Druk op 'gooi' om te beginnen");
        gooiButton = new JButton("gooi");
    }
}
