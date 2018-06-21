package rijden;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 16:31
 */
public class Fiets extends Voertuig {
    private String fietsbelGeluid;

    public Fiets(String string) {
        super(2);
        this.fietsbelGeluid = string;
    }

    public String getFietsbelGeluid() {
        return fietsbelGeluid;
    }
}
