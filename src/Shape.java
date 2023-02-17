/*Create an Interface 'Shape' with undefined methods as
calculateArea and calculatePerimeter. Create 2 classes Circle &
Square that implements functionality defined in the Shape Interface.
Test your code.
 */
public interface Shape {
    void calculateArea(double x);

    void calculatePerimeter(double x);
}

class Circle implements Shape {

    @Override
    public void calculateArea(double r) {
        System.out.println("area of circle: " + (Math.PI * (r * r)));
    }

    @Override
    public void calculatePerimeter(double r) {
        System.out.println("perimeter of circle: " + (2 * Math.PI * r));
    }
}

class Square implements Shape {
    @Override
    public void calculateArea(double l) {
        System.out.println("area of square: " + (l * l));
    }

    @Override
    public void calculatePerimeter(double l) {
        System.out.println("perimeter of square: " + (l * 4));
    }
}

class ShapeTester {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.calculateArea(5.5);
        c.calculatePerimeter(5.5);

        Square s = new Square();
        s.calculateArea(6);
        s.calculatePerimeter(6);
    }
}