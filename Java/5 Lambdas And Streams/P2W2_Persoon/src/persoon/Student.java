package persoon;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 15:36
 */
public class Student extends Persoon {
    private int studentNummer;

    public Student(int id, String naam, int studentNummer){
        super(id, naam);
        this.studentNummer = studentNummer;
    }

    @Override
    public String toString(){
        return String.format("%s %s", super.toString(), this.studentNummer);
    }

}
