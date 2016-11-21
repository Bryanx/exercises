package sitebezoek;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/11/2016 22:41
 */
public class Tijd {
    private int uren, seconden, minuten, honderdsten;
    private static Random random = new Random();

    public Tijd(int uren, int seconden, int minuten, int hondersten) {
        this.uren = uren;
        this.seconden = seconden;
        this.minuten = minuten;
        this.honderdsten = hondersten;
    }

    public Tijd() {
    }

    public int getUren() {
        return this.uren;
    }

    public int getSeconden() {
        return this.seconden;
    }

    public int getMinuten() {
        return this.minuten;
    }

    public int getHonderdsten() {
        return this.honderdsten;
    }

    public int toInteger() {
        return this.honderdsten + this.seconden * 100 + this.minuten * 10000 + this.uren * 1000000;
    }

    public void maakRandomTijd() {
        this.uren = random.nextInt(24);
        this.seconden = random.nextInt(60);
        this.minuten = random.nextInt(60);
        this.honderdsten = random.nextInt(99);
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d.%02d",
                this.uren,
                this.minuten,
                this.seconden,
                this.honderdsten);
    }
}
