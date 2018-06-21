package staticfactory;

public class Demo {
    public static void main(String[] args) {
        Persoon p = PersoonFactory.newPersoon("Sylvia Muyshondt", "63.12.05 254-38");
        System.out.println(p);

        Persoon p2 = PersoonFactory.newPersoon(
                "Sylvia Muyshondt",
                RijksregisterNummerFactory.newNummer("63.12.05 254-38"));
        System.out.println(p2);

        Persoon p3 = PersoonFactory.newPersoon("Sylvia Muyshondt");
        System.out.println(p3);

        System.out.println("naam = " + p.naam());
        System.out.println("nummer = " + p.nummer());

        System.out.println("als long = " + p.nummer().toLong());

    }
}

