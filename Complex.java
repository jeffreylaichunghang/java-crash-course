public final class Complex {
    private int a, b;

    // ! constructor overhead is a slow process
    // ? Invoking one constructor from another constructor is called explicit
    // constructor invocation.

    // constructor with 2 parameters
    private Complex(int i, int j) {
        this.a = i;
        this.b = j;
    }

    // constructor with single parameter
    private Complex(int i) {
        // invokes the constructor with 2 parameters
        this(i, i);
    }

    // constructor with no parameter
    private Complex() {
        // invokes the constructor with single parameter
        this(0);
    }

    @Override
    public String toString() {
        return this.a + " + " + this.b + "i";
    }

    public static void main(String[] args) {

        // creating object of Complex class
        // calls the constructor with 2 parameters
        Complex c1 = new Complex(2, 3);

        // calls the constructor with a single parameter
        Complex c2 = new Complex(3);

        // calls the constructor with no parameters
        Complex c3 = new Complex();

        // print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

// class MoreComplex extends Complex {
// /*
// * Complex is final class
// * cannot be extended anymore
// */
// }
