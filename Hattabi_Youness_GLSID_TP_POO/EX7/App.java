public class App {
    /**
     * The main method demonstrates the functionality of lending and returning items
     * (such as books and DVDs) by a user. It performs the following steps:
     * 
     * 1. Creates a User object with the name "John".
     * 2. Creates a Book object with the title "The Lord of the Rings" and author
     * "J.R.R. Tolkien".
     * 3. Creates a DVD object with the title "Inception" and director "Christopher
     * Nolan".
     * 4. Lends the book and DVD to the user using the `lendObject` method.
     * 5. Prints the lending status of the book and DVD.
     * 6. Returns the book and DVD using the `returnItem` method.
     * 7. Prints the updated lending status of the book and DVD after they are
     * returned.
     * 
     * This method serves as a test to verify the lending and returning
     * functionality
     * of the User, Book, and DVD classes.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        User user = new User("John");
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        DVD dvd = new DVD("Inception", "Christopher Nolan");

        user.lendObject(book);
        user.lendObject(dvd);

        System.out.println("Book lent: " + book.getIsLent());
        System.out.println("DVD lent: " + dvd.getIsLent());

        book.returnItem();
        dvd.returnItem();

        System.out.println("Book lent: " + book.getIsLent());
        System.out.println("DVD lent: " + dvd.getIsLent());
    }
}
