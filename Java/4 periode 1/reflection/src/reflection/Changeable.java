package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// HIER MAG JE NIETS WIJZIGEN!
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Changeable {
}
