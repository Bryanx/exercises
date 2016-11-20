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
        return uren;
    }

    public int getSeconden() {
        return seconden;
    }

    public int getMinuten() {
        return minuten;
    }

    public int getHonderdsten() {
        return honderdsten;
    }

    public int toInteger() {
        return honderdsten + minuten*100 + seconden*10000 + uren*1000000;
    }

    
}
