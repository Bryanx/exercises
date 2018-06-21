package doos;

import lichaam.Kubus;

public class DoosKubus implements Doos {

    private Kubus kubus;

	public DoosKubus(double hoogte){
        kubus = new Kubus(hoogte);
	}

    public double verpakkingsOppervlakte() {
        return kubus.grondvlak()*6;
    }

    public double tapeLengte() {
        return kubus.verticaleOmtrek()*2;
    }

    public double volume() {
	    return kubus.volume();
    }

    @Override
    public String toString() {
        return String.format(
                "Kubusvormige doos: \n" +
                        "\tvolume: %.2f m3\n" +
                        "\tbenodigde verpakking: %.2f m2\n" +
                        "\ttapelengte: %.2f m",
                volume(),
                verpakkingsOppervlakte(),
                tapeLengte());
    }
}