public class Book {
    private int ISBN;
    private String title;
    private Author author;

    public Book() {
        this.ISBN = 0;
        this.title = "";
        this.author = null;
    }

    public Book(int ISBN, String title, Author author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author.toString() + "]";
    }
}
