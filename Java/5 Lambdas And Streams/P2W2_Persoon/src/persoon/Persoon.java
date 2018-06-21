package persoon;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 15:32
 */
public class Persoon {
    private int id;
    private String naam;

    public Persoon(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Persoon)) {
            return false;
        }
        Persoon persoon = (Persoon) obj;

        if (persoon.id == this.id){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString() {
        return String.format("%d %-10s",
                this.id, this.naam);
    }
}
