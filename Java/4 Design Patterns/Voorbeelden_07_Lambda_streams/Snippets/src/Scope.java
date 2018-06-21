import java.util.Arrays;
import java.util.List;

public class Scope {
    private static String driver = "Stoffel";

    public static String getDriver() {
        return driver;
    }

    public static void main(String[] args) {
      /*  String driver = "Stoffel";
        List<String> drivers = Arrays.asList("Hamilton", "Rosberg");
        drivers.forEach(driver -> System.out.print(driver + " "));  */

      /*  String driver = "Stoffel";
        List<String> drivers = Arrays.asList("Hamilton", "Rosberg");
        drivers.forEach(x -> {
            driver = x.toLowerCase();
            System.out.println(driver);
        }); */

      /*
        List<String> drivers = Arrays.asList("Hamilton", "Rosberg");
        drivers.forEach(driver -> System.out.print(driver + " "));
      */

        List<String> drivers = Arrays.asList("Hamilton", "Rosberg");
        drivers.forEach(x -> {
            driver = x.toLowerCase();
            System.out.println(driver);
        });
        System.out.println(Scope.getDriver());
    }
}
