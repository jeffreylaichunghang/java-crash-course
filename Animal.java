/* inheritance */

// superclass
public class Animal {

    String name;

    Animal(String type) {
        System.out.println("I am a " + type + " animal");
    }

    public void eat() {
        System.out.println("I can eat");
    }

    protected void tobeOveride() {
        System.out.println("This method will be override");
    }
}

// subclass
class Dog extends Animal {

    Dog() {
        super("four foot");

        System.out.println("I am a dog");
    }

    public void display() {
        System.out.println("My name is " + name);
    }

    @Override
    // annotations are the metadata that we used to provide information to the
    // compiler
    // ! public provides larger access than the protected.
    public void tobeOveride() {
        super.tobeOveride();
        System.out.println("Dog override this method");
    }

    public static void main(String[] args) {
        Dog mark = new Dog();

        mark.name = "Mark";
        // mark.display();
        // mark.eat();
        // mark.tobeOveride();
    }
}
