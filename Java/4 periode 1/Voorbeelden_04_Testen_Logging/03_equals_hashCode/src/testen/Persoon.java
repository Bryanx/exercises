package testen;

import java.util.Objects;

public class Persoon {
	private String naam;

	public Persoon(String naam) {
   		this.naam = naam;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return Objects.equals(naam, persoon.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }
}

