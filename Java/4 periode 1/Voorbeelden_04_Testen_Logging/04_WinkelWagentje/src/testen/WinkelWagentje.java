package testen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WinkelWagentje {
    private List<Product> wagentje;
    private double saldo;

    public WinkelWagentje() {
        wagentje = new ArrayList<Product>();
    }

    public void voegToe(Product boek) {
        wagentje.add(boek);
        saldo += boek.getPrijs();
    }

    public void verwijder(Product boek) throws IllegalArgumentException {
        if (!wagentje.remove(boek)) {
           throw new IllegalArgumentException("Boek niet gevonden!");
        }
        saldo -= boek.getPrijs();
    }

    public int getAantal() {
        return wagentje.size();
    }

    public double getSaldo() {
        return saldo;
    }

    public void maakWagentjeLeeg() {
        wagentje.clear();
        saldo = 0.0;
    }

    public List<Product> getWagentje() {
        return Collections.unmodifiableList(wagentje);
    }
}

