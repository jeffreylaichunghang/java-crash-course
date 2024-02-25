/*
 * Enum:
 *  - compile-time type safety
 */

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE;
}

class Pizza {
    Size pizzaSize;

    public Pizza(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza() {
        switch (pizzaSize) {
            case SMALL:
                System.out.println("Small size pizza ordered");
                break;
            case MEDIUM:
                System.out.println("Medium size pizza ordered");
                break;
            default:
                System.out.println("Unkown size pizza ordered");
                break;
        }
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(Size.MEDIUM);
        pizza.orderPizza();
    }
}
