public class Main {

    public static void main(String[] args) {
        Figure[] figuren = new Figure[] {
                new Rectangle(4, 5),
                new Square(3),
                new Ellipse(10, 6),
                new Circle(5),
                new Triangle(5,4,30)
        };

        for (int i = 0; i < figuren.length; i++) {
            System.out.println(figuren[i].output());
        }
    }
}
