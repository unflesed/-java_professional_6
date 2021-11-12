package java_professional_6.additional;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Main main = new Main();
        Class<?> cl = Main.class;
        Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
        Math anno = method.getAnnotation(Math.class);
        main.mathSum(anno.num1(), anno.num2());
    }
    @Math(num1 = 100, num2 = 200)
    public static void mathSum(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
