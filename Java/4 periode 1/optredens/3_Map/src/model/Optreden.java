package model;

public class Optreden implements Comparable<Optreden> {
    private String naam;
    private String podium;
    private int uur;
    private int min;
    private int sterren;

    public Optreden(String naam, String podium, int uur, int min, int sterren) {
        this.naam = naam;
        this.podium = podium;
        this.uur = uur;
        this.min = min;
        this.sterren = sterren;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(naam);
        sb.append(" (");
        sb.append(podium);
        sb.append(", ");
        sb.append(uur);
        sb.append("u");
        if (min > 0) sb.append(min);
        sb.append(")--> ");
        for (int i = 0; i < sterren; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

	public int getUur() {
		return uur;
	}

	public int getMin() {
		return min;
	}

	public int getSterren() {
		return sterren;
	}

	public String getNaam() {
		return naam;
	}

	public String getPodium() {
		return podium;
	}

    @Override
    public int compareTo(Optreden o2) {
        return (getUur()*60+getMin())-(o2.getUur()*60+o2.getMin());
    }
}
