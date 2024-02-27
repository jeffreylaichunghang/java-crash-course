/*
 * CustomAnnotation
 * - default value is optional
 * - parameter cannot have a null value
 */
@interface CustomAnnotation {
    String value() default "default value";
}

public class MyCustomAnnotation {
    @CustomAnnotation(value = "java")
    public void method1() {
        System.out.println("Test method 1");
    }

    public static void main(String[] args) {
        MyCustomAnnotation obj = new MyCustomAnnotation();
        obj.method1();
    }
}
