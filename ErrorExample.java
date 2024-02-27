public class ErrorExample {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ArithmeticException => " + e.getMessage());
        } finally {
            System.out.println("This line is going to be printed out no matter out");
            // ! Good practice: include clean up code likes
            // - codes that must be ran no matter there is an error or not
            // - closing a file or connection
            // ? find: how to pass e from the catch to the finally block or
            // exception-handling can only be done in catch block

        }
    }
}
