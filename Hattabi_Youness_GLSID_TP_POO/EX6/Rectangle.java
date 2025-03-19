public class Rectangle extends Figure {
    private double width, height;

    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(String nom, double width, double height) {
        super(nom);
        this.width = width;
        this.height = height;
    }

    public double surface() {
        return width * height;
    }

    public double perimetre() {
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
