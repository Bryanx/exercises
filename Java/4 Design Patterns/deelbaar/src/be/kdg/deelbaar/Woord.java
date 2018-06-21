package be.kdg.deelbaar;

/*
    TODO: De klasse Woord implementeert de interface Deelbaar
    Als je een woord deelt, dan blijft enkel de eerste helft van het woord over.
 */
public class Woord implements Deelbaar{
    private String str;

    public Woord(String str){
        this.str = str;
    }

    public String toString() {
        return str;
    }

    @Override
    public Deelbaar getHelft() {
        String temp = str.substring(0, str.length()/2);
        return new Woord(temp);
    }
}
