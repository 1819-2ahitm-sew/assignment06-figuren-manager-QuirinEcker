public class Rectangle extends Figure {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumference() {
        return 2 * (length + width);
    }

    @Override
    public String output() {
        return "Rechteck mit Länge " + length + " und Breite " + width + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }
}
