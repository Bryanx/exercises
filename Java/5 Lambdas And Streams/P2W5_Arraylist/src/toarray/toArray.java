package toarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/2016 17:05
 */
public class toArray {
    public static void main(String[] args) {
        //Integer is een wrapper klasse, het is een object geen primitief type.
        List<Integer> getallenList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            getallenList.add(r.nextInt(50) + 1);
            getallenList.get(i);
        }

        System.out.println(getallenList);

        int[] getallenArray = new int[getallenList.size()];
        for (int i = 0; i < getallenList.size(); i++) {
            getallenArray[i] = getallenList.get(i);
        }

        List<Integer> evenGetallen = new ArrayList<>();
        for (int i : getallenArray) {
            if (i % 2 == 0) evenGetallen.add(i);
        }

        // Met een array van strings kan je gebruik maken van aslist voor de omzetting
        // van een Arraylist naar een String[]
        List<String> namenList = new ArrayList<>();
        String[] namenArray = namenList.toArray(new String[0]);
        List<String> andereNamenList = Arrays.asList(namenArray);
    }


}
