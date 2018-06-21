package annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectieDemo {
    public static void main(String[] args) throws Exception {

        Class<Hallo> clazz = Hallo.class;
        System.out.println(clazz.getAnnotation(DoeDeGroeten.class));

        Constructor<Hallo> constructor = clazz.getConstructor();
        System.out.println(constructor.getAnnotation(DoeDeGroeten.class));

        Method method = clazz.getMethod("groet");
        System.out.println(method.getAnnotation(DoeDeGroeten.class));

        Field field = clazz.getDeclaredField("groetToestand");
        field.setAccessible(true);
        System.out.println(field.getAnnotation(DoeDeGroeten.class));
    }
}

