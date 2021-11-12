package java_professional_6.task_2;

/**
 * @author Anatoly Morozov
 */

public class Calc {
    /**
     * First variable
     */
    private int a;
    /**
     * Second variable
     */
    private int b;
    /**
     * Constructor for initializing Calc object
     */
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    /**
     * Method which calculate sum of variables
     */
    @Math(a = 10, b = 5)
    public int sum(int a, int b){return a + b;}
    /**
     * Method which calculate difference of variables
     */
    @Math(a = 10, b = 5)
    public int diff(int a, int b){return a - b;}
    /**
     * Method which calculate multiplication of variables
     */
    @Math(a = 10, b = 5)
    public int mult(int a, int b){return a * b;}
    /**
     * Method which calculate division of variables
     */
    @Math(a = 10, b = 5)
    public int div(int a, int b){return a / b;}
}
