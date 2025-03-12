
public class circle {

    double radius;

    circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    double circumference() {
        return Math.PI * radius;
    }

    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
