package GLAB303_11_1;

public class myRunner {
    public static void main(String[] args) {

        // initialize the class
        DemoClass dObj = new DemoClass();

        dObj.genericsMethod(25);           // Integer
        dObj.genericsMethod("Per Scholas"); // String
        dObj.genericsMethod(2563.5);       // Double
        dObj.genericsMethod('H');          // Character
    }
}
