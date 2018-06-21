import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "'", "'");
        String string = joiner.add("Red").add("Green").add("Blue").toString();
        System.out.println(string);

        List<String> strings = Arrays.asList("Red", "Green", "Blue");
        String korter = String.join(", ", strings);
        System.out.println(korter);
    }
}

/*
'Red, Green, Blue'
Red, Green, Blue
 */