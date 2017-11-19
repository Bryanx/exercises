package be.kdg.craps.view;

import javax.swing.*;
import java.awt.*;

public class DobbelsteenComponent extends JComponent {
    private int waarde;
    private int[] positiesX;
    private int[] positiesY;
    private Color dobbelsteenkleur;
    private Color randKleur;
    private Color oogKleur;

    public DobbelsteenComponent(int waarde) {
        this.waarde = waarde;
        this.positiesX = new int[7];
        this.positiesY = new int[7];
        this.dobbelsteenkleur = Color.lightGray;
        this.randKleur = Color.BLACK;
        this.oogKleur = Color.BLACK;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
        repaint();
    }

    public void setDobbelsteenkleur(Color dobbelsteenkleur) {
        this.dobbelsteenkleur = dobbelsteenkleur;
    }

    public void setRandKleur(Color randKleur) {
        this.randKleur = randKleur;
    }

    public void setOogKleur(Color oogKleur) {
        this.oogKleur = oogKleur;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int length = Math.min(width, height);
        int centerx = width/2;
        int centery = height/2;
        g.setColor(dobbelsteenkleur);
        length = length * 8 / 10;
        g.fillRoundRect(centerx-length/2, centery-length/2, length, length, length/6, length/6);
        g.setColor(randKleur);
        g.drawRoundRect(centerx-length/2, centery-length/2, length, length, length/6, length/6);
        bepaalPosities(centerx, centery, length);
        g.setColor(oogKleur);
        if (waarde == 1) tekenEen(g, length);
        else if (waarde == 2) tekenTwee(g, length);
        else if (waarde == 3) tekenDrie(g, length);
        else if (waarde == 4) tekenVier(g, length);
        else if (waarde == 5) tekenVijf(g, length);
        else if (waarde == 6) tekenZes(g, length);
    }

    private void bepaalPosities(int centerx, int centery, int length) {
        positiesX[0] = centerx;
        positiesY[0] = centery;
        positiesX[1] = centerx - length/4;
        positiesY[1] = centery - length/4;
        positiesX[2] = centerx + length/4;
        positiesY[2] = centery - length/4;
        positiesX[3] = centerx - length/4;
        positiesY[3] = centery;
        positiesX[4] = centerx + length/4;
        positiesY[4] = centery;
        positiesX[5] = centerx - length/4;
        positiesY[5] = centery + length/4;
        positiesX[6] = centerx + length/4;
        positiesY[6] = centery + length/4;
    }

    private void tekenEen(Graphics g, int length) {
        tekenPunt(g, length, 0);
    }

    private void tekenTwee(Graphics g, int length) {
        tekenPunt(g, length, 1);
        tekenPunt(g, length, 6);
    }

    private void tekenDrie(Graphics g, int length) {
        tekenPunt(g, length, 1);
        tekenPunt(g, length, 0);
        tekenPunt(g, length, 6);
    }

    private void tekenVier(Graphics g, int length) {
        tekenPunt(g, length, 1);
        tekenPunt(g, length, 2);
        tekenPunt(g, length, 5);
        tekenPunt(g, length, 6);
    }

    private void tekenVijf(Graphics g, int length) {
        tekenPunt(g, length, 1);
        tekenPunt(g, length, 2);
        tekenPunt(g, length, 5);
        tekenPunt(g, length, 6);
        tekenPunt(g, length, 0);
    }

    private void tekenZes(Graphics g, int length) {
        tekenPunt(g, length, 1);
        tekenPunt(g, length, 2);
        tekenPunt(g, length, 3);
        tekenPunt(g, length, 4);
        tekenPunt(g, length, 5);
        tekenPunt(g, length, 6);
    }

    private void tekenPunt(Graphics g, int size, int puntNummer) {
        int scaledSize = size/5;
        g.fillOval(positiesX[puntNummer]-scaledSize/2, positiesY[puntNummer]-scaledSize/2, scaledSize, scaledSize);
    }


    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }
}
