public class App {
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
