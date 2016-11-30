package minmax;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 17:13
 */
public class Strings implements MinMax {
    private String[] strings = new String[MAX_AANTAL];
    private int aantal;

    public void add(String string) {
        if (aantal < MAX_AANTAL) {
            this.strings[aantal] = string;
            aantal++;
        }
    }

    @Override
    public String minimum() {
        if (aantal == 0) return "";
        String kleinste = strings[0];
        for (int i = 1; i < aantal; i++) {
            if (strings[i].compareTo(kleinste) < 0) { //negatief getal is kleiner
                kleinste = strings[i];
            }
        }
        return kleinste;
    }

    @Override
    public String maximum() {
        if (aantal == 0) return "";
        String grootste = strings[0];
        for (int i = 1; i < aantal; i++) {
            if (strings[i].compareTo(grootste) > 0) { //positief getal is groter
                grootste = strings[i];
            }
        }
        return grootste;
    }

    public void toon() {
        for (int i = 0; i < aantal; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
}
