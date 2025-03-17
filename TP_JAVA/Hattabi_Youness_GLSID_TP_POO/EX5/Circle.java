public class Circle extends Figure {
    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String nom, double radius) {
        super(nom);
        this.radius = radius;
    }

    public double surface() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimetre() {
        return 2 * Math.PI * radius;
    }
}
