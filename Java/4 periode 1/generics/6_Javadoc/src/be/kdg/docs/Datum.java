package be.kdg.docs;

public class Datum {
    private int dag;
    private int maand;
    private int jaar;

    /**
     * Constructor voor een be.kdg.docs.Datum-object op basis van dag,
     * maand en jaar.
     * @param dag De dag
     * @param maand De maand
     * @param jaar Het jaar
     */
    public Datum(int dag, int maand, int jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }
}
