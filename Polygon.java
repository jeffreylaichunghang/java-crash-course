/**
 * Interface
 *
 * ? interface provides specifications that a class implementing it must follow
 *
 */

// all classes implment polygon must provide getArea method
interface Polygon {
    void getArea(int length, int width);

    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }

        System.out.println("Perimeter: " + perimeter);
    }
}

// all classes implment Color must provide getColor method
interface Color {
    void getColor(String color);
}

// all classes implment StrokeColor must provide getStroke method
interface StrokeColor extends Color {

    int width = 5; // by default public static final

    void getStroke(String color);

    public default int getWidth() {
        return this.width;
    }
}

class Rectangle implements Polygon, StrokeColor {
    public void getArea(int length, int width) {
        System.out.println("Rectangle area = " + (length * width));
    }

    public void getColor(String color) {
        System.out.println("Rectangle color = " + color);
    }

    public void getStroke(String color) {
        Rectangle rectangle = new Rectangle();
        int width = rectangle.getWidth(); // width here is set by default in StrokeColor interface
        System.out.println("Rectangle has a " + color + " stroke in " + width + " cm");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        // rectangle.getArea(5, 5);
        // rectangle.getColor("red");
        // rectangle.getStroke("red");
        rectangle.getPerimeter(4, 4, 4, 4);
    }
}
