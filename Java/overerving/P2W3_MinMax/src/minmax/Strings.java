package minmax;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 17:13
 */
public class Strings implements MinMax {
    private String[] strings  = new String[100];
    private int aantal;

    public void add(String string) {
        this.strings[aantal] = string;
        aantal++;
    }

    @Override
    public String maximum() {
        String kleinste = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < aantal; i++) {
            if (strings[i].length() < min) {
                min = strings[i].length();
                kleinste = strings[i];
            }
        }
        return kleinste;
    }

    @Override
    public String minimum() {
        String string = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < aantal; i++) {
            if (strings[i].length() > max) {
                max = strings[i].length();
                string = strings[i];
            }
        }
        return string;
    }

    public void toon(){
        for (int i = 0; i < aantal; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
}
