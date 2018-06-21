package wijnen;

/**
 * PEER opdracht
 * P2W2
 */
public enum Smaak {
    BRUT, EXTRA_BRUT, BRUT_SANS_MILLESIME, SEC, DEMI_SEC, DOUX;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
