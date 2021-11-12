package java_professional_6.task_3;

import java.lang.annotation.*;

class A {
    @Annotation
    void draw(){}
}
class B extends A {

    @Override
    void draw(){}
}
@Deprecated
class C extends B{
    int[] a;
    @SafeVarargs
    public C(int... a) {
        this.a = a;
    }
}
@Inherited
@Documented
@Target({ElementType.METHOD,ElementType.FIELD, ElementType.TYPE})
@interface Annotation{
    String str() default "Test";
}