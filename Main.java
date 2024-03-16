class Shape {
    public double calculateArea() {
        return 0.0; // Default implementation for unspecified shapes
    }
}

class Rectangle extends Shape {
     double length;
     double width;

    public Rectangle(double length, double width) {
        super(); // Invoking superclass constructor
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
     double radius;

    public Circle(double radius) {
        super(); // Invoking superclass constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
