package annotations;

import java.lang.reflect.Method;

public class DemoMarker {
    public static void main(String[] args) {
        for (Method method : Spel.class.getDeclaredMethods()) {
            Unfinished unfinished = method.getAnnotation(Unfinished.class);
            System.out.print(method.getName());
            if (unfinished != null) {
                System.out.println(" --> NOG AFWERKEN!");
            } else {
                System.out.println(" --> OK");
            }
         }
    }
}
