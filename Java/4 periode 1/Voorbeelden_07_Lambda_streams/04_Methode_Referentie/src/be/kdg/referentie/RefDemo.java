package be.kdg.referentie;

public class RefDemo {
    public static void main(String[] args) {
        String string = "Demo";

        // Class::staticMethode
        String demo = Util.transform(string, Util::benadruk);
        // String demo = Util.transform(string, s -> Util.benadruk(s));
        System.out.println(demo);

        // object:methode
        String prefix = "Mijn";
        demo = Util.transform(string, new StringFunctie() {
            @Override
            public String pasFunctieToe(String str) {
                return prefix.concat(str);
            }
        });
        // demo = Util.transform(string, s -> prefix.concat(s));
        System.out.println(demo);

        // Class::methode


        demo = Util.transform(string, s -> s.toUpperCase());

        // demo = Util.transform(string, s -> s.toUpperCase());
        System.out.println(demo);
    }
}

/*
Demo!!
MijnDemo
DEMO
*/