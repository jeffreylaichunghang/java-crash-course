// ! (private, protected) access modifier cannot be declared in classes but only inner classes
// ? Access modifiers are mainly used for encapsulation

public class Menu {
    String name;
    private int cost;

    public Menu(String menuName) {
        this.name = menuName;
        this.cost = 10;
    }

    public void getName() {
        System.out.println("This is a " + this.name + " menu");
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    void logger() {
        /* default access modifier */
        System.out.println("This is a message");
    }

    protected void display() {
        /* protected access modifier */
        System.out.println("This is a menu");
    }

    public static void main(String[] args) {
        // ! String is object in java
        // ? when we create a string object, the String() constructor is invoked. A new
        // string is created even it exists in the memory pool
        // string concatenation method
        String first = "Java ";
        String second = new String("Programming");
        String joinedString = first.concat(second);
        // System.out.println("Joined String: " + joinedString); // or
        // System.out.println(first + second);
        /* string compare */
        System.out.println(first.equals(second)); // or
        System.out.println(first == second);
        System.out.println(joinedString.contains(first));
    }
}
