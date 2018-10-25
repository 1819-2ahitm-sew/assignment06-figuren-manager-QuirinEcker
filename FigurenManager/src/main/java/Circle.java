public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double circumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String output() {
        return "Kreis mit Radius " + radius + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }
}
