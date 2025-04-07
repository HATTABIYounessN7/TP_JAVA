public class Rectangle extends Figure {
    private double width, height;

    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    /**
     * Constructs a Rectangle object with the specified name, width, and height.
     *
     * @param nom    The name of the rectangle.
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(String nom, double width, double height) {
        super(nom);
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates and returns the surface area of the rectangle.
     *
     * @return The surface area of the rectangle.
     */
    public double surface() {
        return width * height;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     *
     * @return The perimeter of the rectangle.
     */
    public double perimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
