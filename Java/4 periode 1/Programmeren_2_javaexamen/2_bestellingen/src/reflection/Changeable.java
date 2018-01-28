package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Examen Programmeren 2 - Java
 * Januari 2017
 * IN DEZE KLASSE MAG JE NIETS WIJZIGEN!
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Changeable {
}
