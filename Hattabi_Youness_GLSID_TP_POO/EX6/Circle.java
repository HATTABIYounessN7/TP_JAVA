public class Circle extends Figure {
    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    /**
     * Constructs a Circle object with the specified name and radius.
     *
     * @param nom    The name of the circle.
     * @param radius The radius of the circle.
     */
    public Circle(String nom, double radius) {
        super(nom);
        this.radius = radius;
    }

    /**
     * Calculates the surface area of the circle.
     *
     * @return The surface area of the circle.
     */
    public double surface() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the perimeter of the circle.
     *
     * @return The perimeter of the circle. .
     */
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
