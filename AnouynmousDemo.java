
interface Shape {
    // public void display() {
    // System.out.println("Inside the Shape class");
    // }
    public void display();
}

class Square {

    /*
     * Anouynmous class is created dynamically when needed, it makes the code
     * concise
     */
    public void createClass() {

        Shape s1 = new Shape() {
            public void display() {
                System.out.println("Inside an anouymous class");
            }
        };
        s1.display();
    }
}

public class AnouynmousDemo {

    public static void main(String[] args) {
        Square p1 = new Square();
        p1.createClass();
    }
}
