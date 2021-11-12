package java_professional_6.task_2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc(2,1);
        Class<?> cl = Calc.class;
        Method[] methods = cl.getDeclaredMethods();
        Math anno = methods[0].getAnnotation(Math.class);
        System.out.println("Сумма - " + calc.sum(anno.a(), anno.b()));
        Math anno1 = methods[1].getAnnotation(Math.class);
        System.out.println("Разность - " + calc.diff(anno1.a(), anno1.b()));
        Math anno2 = methods[2].getAnnotation(Math.class);
        System.out.println("Произведение - " + calc.mult(anno2.a(), anno2.b()));
        Math anno3 = methods[3].getAnnotation(Math.class);
        System.out.println("Деление - " + calc.div(anno3.a(), anno3.b()));
    }
}
