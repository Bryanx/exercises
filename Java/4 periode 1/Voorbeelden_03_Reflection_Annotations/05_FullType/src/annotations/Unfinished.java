package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Unfinished {
    public enum Belangrijkheid {
        KRITIEK, BELANGRIJK, GEWOON
    }

    Belangrijkheid belangrijkheid()
            default Belangrijkheid.BELANGRIJK;

    String toDo();

    String eindDatum();
}