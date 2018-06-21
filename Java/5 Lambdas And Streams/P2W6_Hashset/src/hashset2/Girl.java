package hashset2;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 14:45
 */
public class Girl {
    private String naam;
    private int leeftijd;

    public Girl(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return this.naam + " " + this.leeftijd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Girl girl = (Girl) o;

        if (leeftijd != girl.leeftijd) return false;
        return naam != null ? naam.equals(girl.naam) : girl.naam == null;

    }

    @Override
    public int hashCode() {
        int result = naam != null ? naam.hashCode() : 0;
        result = 31 * result + leeftijd;
        return result;
    }
}
