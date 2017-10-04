package annotations;

@DoeDeGroeten("Hello, class!")
public class Hallo {
    @DoeDeGroeten("Hello, field!")
    private String groetToestand;

    @DoeDeGroeten("Hello, constructor!")
    public Hallo() {
    }

    @DoeDeGroeten("Hello, method!")
    public void groet() {
    }
}

