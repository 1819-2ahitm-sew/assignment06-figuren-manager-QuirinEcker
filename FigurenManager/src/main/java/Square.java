public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double circumference() {
        return 4 * side;
    }

    @Override
    public String output() {
        return "Qzadrat mit Seitenlänge " + side + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }
}
