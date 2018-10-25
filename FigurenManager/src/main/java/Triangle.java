public class Triangle extends Figure {

    public double side1;
    public double side2;
    public double side3;
    public double angleBetween;

    public Triangle(int side1, int side2, int anglebetween) {
        this.angleBetween = anglebetween;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(anglebetween));
    }

    @Override
    public double area() {
        return side1 * side2 * Math.sin(angleBetween) / 2;
    }

    @Override
    public double circumference() {
        double circumference = side1 + side2 + side3;

        return circumference;
    }

    @Override
    public String output() {
        String output = "" + circumference() + " "  + area();

        return output;
    }
}
