package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/10/17 15:50
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();
        for (Method method : RuimtePunt.class.getMethods()) {
            if (method.getAnnotation(Deprecated.class) != null)
                namen.add(method.getName());
        }

        namen.forEach(System.out::println);
    }
}
