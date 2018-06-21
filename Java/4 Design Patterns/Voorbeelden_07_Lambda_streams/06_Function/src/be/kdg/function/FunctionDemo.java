package be.kdg.function;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static <T> double mapSum(List<T> entries, Function<T, Double> mapper) {
        double sum = 0;
        for (T entry : entries) {
            sum += mapper.apply(entry);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Artikel> lijst = Artikels.getArtikels();

        System.out.println("Som artikelnummers: " + mapSum(lijst, a -> (double)a.getNummer()));
        // System.out.println("Som prijzen: " + mapSum(lijst, a -> a.getPrijs()));
        System.out.println("Som prijzen: " + mapSum(lijst, Artikel::getPrijs));
    }
}

/*
Som artikelnummers: 55.0
Som prijzen: 5630.0
*/