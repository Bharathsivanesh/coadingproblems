package CoreJava.ExceptionHandling;

public class Arithmetic {

    public static void main(String[] args) {

        try {
            int res = 10 / 0;
            System.out.println(res);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
