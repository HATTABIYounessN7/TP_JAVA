public class App {
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
