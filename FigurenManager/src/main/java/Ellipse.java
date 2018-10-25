public class Ellipse extends Figure {

    private double mainAxis;
    private double sideAxis;
    private double lambda;

    public Ellipse(double mainAxis, double sideAxis) {
        this.mainAxis = mainAxis;
        this.sideAxis = sideAxis;
        this.lambda = (mainAxis - sideAxis) / (sideAxis + mainAxis);
    }

    @Override
    public double area() {
        return mainAxis * sideAxis * Math.PI;
    }

    @Override
    public double circumference() {
        return (mainAxis + sideAxis) * Math.PI * (1 + ((3 * lambda * lambda) / (10 + Math.sqrt(4 - 3 * lambda * lambda))));
    }

    @Override
    public String output() {
        return "Ellipse mit Hauptachse " + mainAxis + " und Nebenachse " + sideAxis + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }
}
