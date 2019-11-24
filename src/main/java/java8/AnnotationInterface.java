package java8;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface AnnotationInterface {
   String name();
   String method();
}
