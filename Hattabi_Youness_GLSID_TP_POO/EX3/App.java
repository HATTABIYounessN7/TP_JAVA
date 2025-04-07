import java.util.Date;

public class App {
    /**
     * The main function creates an instance of an Adherent and a Book, then prints
     * them out.
     */
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Adherent", "Adherent", "adherent@test.com", "2125126812",
                new Date(System.currentTimeMillis()));

        Book book = new Book(2, "The Book", new Author(
                "Author", "The", "Author@test.com", "2842671265", new Date(System.currentTimeMillis())));

        System.out.println(adherent);
        System.out.println(book);
    }
}
