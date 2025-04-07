public class Book implements Lendable {
    private String title;
    private String author;
    private Boolean isLent = false;

    public Book() {
        this("", "");
    }

    /**
     * Constructs a new Book with the specified title and author.
     *
     * @param title  the title of the book
     * @param author the author of the book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Returns the current lending status of the book.
     *
     * @return the lending status of the book. True if the book is currently lent,
     *         false otherwise.
     */
    public Boolean getIsLent() {
        return this.isLent;
    }

    /**
     * Sets the lending status of the book.
     *
     * @param isLent the new lending status of the book. True if the book is to be
     *               marked as lent,false otherwise.
     */
    public void setIsLent(Boolean isLent) {
        this.isLent = isLent;
    }

    /**
     * Lends the book.
     *
     * This method updates the lending status of the book to true and prints a
     * message indicating that the book has been lent.
     *
     * @see Lendable#lend()
     */
    @Override
    public void lend() {
        System.out.println("Book lent");
        setIsLent(true);
    }

    /**
     * Returns the book to the library.
     *
     * This method updates the lending status of the book to false and prints a
     * message indicating that the book has been returned.
     *
     * @see Lendable#returnItem()
     */
    @Override
    public void returnItem() {
        System.out.println("Book returned");
        setIsLent(false);
    }

}
