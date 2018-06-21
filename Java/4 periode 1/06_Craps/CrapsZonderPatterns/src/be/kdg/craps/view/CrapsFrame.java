package be.kdg.craps.view;

import be.kdg.craps.model.craps.CrapsSpel;

import javax.swing.*;
import java.awt.*;

public class CrapsFrame extends JFrame {
    private CrapsSpel crapsSpel;

    private JLabel welkomLabel;
    private CrapsPanel crapsPanel;

    public CrapsFrame(CrapsSpel crapsSpel, String gebruikersnaam) {
        this.crapsSpel = crapsSpel;
        setTitle("Craps " + gebruikersnaam);

        maakComponenten(gebruikersnaam);
        layoutComponenten();
        voegListenersToe();

        pack();
        setVisible(true);
    }

    private void voegListenersToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void layoutComponenten() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(crapsPanel, BorderLayout.CENTER);
        JPanel welkomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        welkomPanel.add(welkomLabel);
        contentPane.add(welkomPanel, BorderLayout.NORTH);
    }

    private void maakComponenten(String gebruikersnaam) {
        crapsPanel = new CrapsPanel(crapsSpel);
        welkomLabel = new JLabel("Welkom " + gebruikersnaam);
    }
}
