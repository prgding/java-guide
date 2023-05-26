package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static int testMethod() {
        try {
            System.out.println("Inside try block");
            return 1;
        } catch (Exception e) {
            System.out.println("Inside catch block");
            System.exit(2);
            return 2;
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
