abstract class Shape {
    abstract double area();
}
class Rectangle extends Shape {
    double l = 10, b = 5;
    double area() {
    return l * b;
}
}
class Triangle extends Shape {
    double b = 4, h = 6;
    double area() {
    return 0.5 * b * h;
}
}
public class Main3 {
    public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Triangle t = new Triangle();
    System.out.println(r.area());
    System.out.println(t.area());
}
}