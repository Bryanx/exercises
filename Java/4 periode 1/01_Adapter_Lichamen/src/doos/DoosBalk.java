package doos;

import lichaam.Balk;

public class DoosBalk implements Doos {

    private Balk balk;

	public DoosBalk(double hoogte, double lengte, double breedte){
	    balk = new Balk(hoogte,lengte,breedte);
    }

    public double verpakkingsOppervlakte() {
        return  balk.getHoogte() * balk.getBreedte() * 2 +
                balk.getBreedte() * balk.getLengte() * 2 +
                balk.getHoogte() * balk.getLengte() * 2;
    }

    public double tapeLengte() {
        return balk.verticaleOmtrek()*2;
    }

    public double volume() {
        return balk.volume();
    }

    @Override
    public String toString() {
        return String.format(
                "Balkvormige doos: \n" +
                "\tvolume: %.2f m3\n" +
                "\tbenodigde verpakking: %.2f m2\n" +
                "\ttapelengte: %.2f m",
                volume(),
                verpakkingsOppervlakte(),
                tapeLengte());
    }
}