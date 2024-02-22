abstract class Language {

    Language(String className) {
        System.out.println(className + " class init!");
    }

    abstract void display();

    public void show() {
        System.out.println("This is a java language");
    }
}

class English extends Language {

    English() {
        super("English");
    }

    public static void main(String[] args) {
        English obj = new English();
        obj.show();
        obj.display();
    }

    public void display() {
        System.out.println("This is an English language");
    }
}
