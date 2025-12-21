public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4, 3);
        System.out.println("Area = " + shape.calculateArea());
        
        // Test avec un cercle aussi
        Shape circle = new Circle(5);
        System.out.println("Circle area = " + circle.calculateArea());
    }
}