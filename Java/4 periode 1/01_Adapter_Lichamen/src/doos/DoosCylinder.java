package doos;


import lichaam.Cylinder;

public class DoosCylinder implements Doos {

	private Cylinder cyl;
	public DoosCylinder(double hoogte, double lengte){
	    cyl = new Cylinder(hoogte, lengte);
	}

    public double verpakkingsOppervlakte() {
        return (cyl.grondvlak()*2) + (cyl.getHoogte()*cyl.getStraal()*2*Math.PI);
    }

    public double tapeLengte() {
        return cyl.verticaleOmtrek()*2;
    }

    public double volume() {
        return cyl.volume();
    }

    @Override
    public String toString() {
        return String.format(
                "Cylindervormige doos: \n" +
                        "\tvolume: %.2f m3\n" +
                        "\tbenodigde verpakking: %.2f m2\n" +
                        "\ttapelengte: %.2f m",
                volume(),
                verpakkingsOppervlakte(),
                tapeLengte());
    }
}