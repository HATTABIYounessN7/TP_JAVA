import java.util.Date;

public class App {
    public static void main(String[] args) {
        Adherent adherent = new Adherent(2, "Adherent", "Adherent", "adherent@test.com", "2125126812",
                new Date(System.currentTimeMillis()));

        Book book = new Book(5, "The Book", new Author(
                7, "Author", "The", "Author@test.com", "2842671265", new Date(System.currentTimeMillis())));

        System.out.println(adherent);
        System.out.println(book);
    }
}
