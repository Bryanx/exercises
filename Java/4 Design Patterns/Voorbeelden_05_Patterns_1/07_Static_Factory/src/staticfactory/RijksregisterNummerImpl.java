package staticfactory;

public class RijksregisterNummerImpl implements RijksregisterNummer {
    private String string;
    // private long nummer;

    public RijksregisterNummerImpl(String string) {
        this.string = string;
    }

    public long toLong() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char teken = string.charAt(i);
            if (Character.isDigit(teken)) {
                builder.append(teken);
            }
        }
        return Long.parseLong(builder.toString());
    }

    public String toString() {
        return string;
    }
}

