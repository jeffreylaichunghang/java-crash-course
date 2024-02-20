
// Your First Program
import java.util.Arrays;
import java.util.Scanner;

class Menu {
    String name;

    public Menu(String menuName) {
        this.name = menuName;
    }

    public void getName() {
        System.out.println("This is a " + this.name + " menu");
    }
}

// class name and file name should be same
class Hello {
    private String name;

    // constructor
    public Hello() {
        System.out.println("constructor called");
        name = "Hello";
    }

    public static void main(String[] args) {
        Menu breakfastMenu = new Menu("breakfast");
        Menu lunchMenu = new Menu("lunch");
        breakfastMenu.getName();
        lunchMenu.getName();

        // /* array */
        // int[] ages = { 1, 2, 3, 4, 5 };
        // // int[] numbers = new int[5];
        // // System.arraycopy(ages, 0, numbers, 0, 1);
        // int[] numbers = Arrays.copyOfRange(ages, 0, ages.length);
        // System.err.println(Arrays.toString(numbers));

        // /* for each loop */
        // int[] numbers = { 3, 9, 5, -5 };

        // for (int number : numbers) {
        // System.out.println(number);
        // }

        // int number = 10;
        // ++number;
        // System.err.println(number);

        // // Example: Get Integer Input From the User
        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter an integer: ");
        // int number = input.nextInt();
        // System.out.println("You entered " + number);

        // System.out.print("Enter an text: ");
        // String string = input.next();
        // System.out.println("You entered " + string);

        // input.close(); // close the scanner object once the input is taken

        // System.out.print("Hello, World!");
        // System.out.print("followed by Goodbye world");
        // System.out.println();
        // System.out.println("this sentence starts at the new line");
        // System is a class
        /*
         * print() -> print string inside the quotes
         * println() -> similar as print and the cursor moves to the beginning of the
         * next line
         * printf() -> provides string formatting
         */
    }
}
