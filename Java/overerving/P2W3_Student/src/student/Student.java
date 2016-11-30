package student;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 09:32
 */
public class Student {
    class Studentenkaart {
        int studentnummer;

        Studentenkaart(int studentnummer){
            this.studentnummer = studentnummer;
        }

    }
    private int leeftijd;
    private String naam;

    public Student(String naam, int leeftijd){
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    public String getNaam(){
        class Banaan{
            private int grootte;

            public int getGrootte(){
                return grootte;
            }
        }
        Banaan b = new Banaan();
        System.out.println(b.getGrootte());
        return naam;
    }

    public int getLeeftijd() {
        Feester feester = new Feester() {   /// <- Anonymous innerclass
            @Override
            public void zuiper() {
                System.out.println("zuipuh!");
            }
        };
        feester.zuiper();
        return leeftijd;
    }
}
