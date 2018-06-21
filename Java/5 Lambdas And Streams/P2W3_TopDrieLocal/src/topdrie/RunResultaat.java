package topdrie;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 11:00
 */
public class RunResultaat {
    public static void main(String[] args) {
        String[] data = {
                "S.Vettel", "F.Alonso", "K.Räikkönen", "L.Hamilton",
                "M.Webber", "N.Rosberg", "R.Grosjean", "F.Massa"
        };
        Resultaat resultaat = new Resultaat(data);
        System.out.println(resultaat.topDrie("F1 2013"));
    }
}