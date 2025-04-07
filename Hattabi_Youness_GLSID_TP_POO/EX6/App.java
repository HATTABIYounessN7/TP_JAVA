public class App {
    /**
     * The main method serves as the entry point for the application.
     * It demonstrates the creation and usage of an array of `Figure` objects,
     * which includes instances of `Circle` and `Rectangle`.
     * 
     * Steps performed:
     * 1. Initializes an array of `Figure` objects with a size of 4.
     * 2. Populates the array with two `Circle` objects and two `Rectangle` objects,
     * each initialized with specific names and dimensions.
     * 3. Iterates through the array and prints the details of each `Figure` object
     * using their overridden `toString` method.
     * 
     * Expected Output:
     * The details of each `Figure` object in the array, printed to the console.
     * 
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Circle("Cercle", 5);
        figures[1] = new Rectangle("Rectangle", 5, 10);
        figures[2] = new Circle("Cercle", 10);
        figures[3] = new Rectangle("Rectangle", 10, 20);

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
