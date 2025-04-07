public class Book {
    private int ISBN;
    private String title;
    private Author author;

    // The `public Book()` constructor is a default constructor for the `Book`
    // class. It initializes a
    // new `Book` object with default values. In this case, it sets the ISBN to 0,
    // the title to an
    // empty string, and the author to null. This constructor can be used to create
    // a new `Book` object
    // without specifying any initial values for its attributes.
    public Book() {
        this.ISBN = 0;
        this.title = "";
        this.author = null;
    }

    // The `public Book(int ISBN, String title, Author author)` constructor in the
    // `Book` class is a
    // parameterized constructor that initializes a new `Book` object with specific
    // values for its
    // attributes. When this constructor is called, it sets the `ISBN`, `title`, and
    // `author` of the `Book`
    // object to the values provided as arguments to the constructor. This allows
    // you to create a `Book`
    // object with custom values for its attributes at the time of instantiation.
    public Book(int ISBN, String title, Author author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    /**
     * The `getISBN` function in Java returns the ISBN of an object.
     * 
     * @return The method `getISBN()` is returning the value of the `ISBN` field of
     *         the current object.
     */
    public int getISBN() {
        return this.ISBN;
    }

    /**
     * The function `setISBN` sets the ISBN of a book object to the provided value.
     * 
     * @param ISBN The parameter `ISBN` is an integer value that represents the
     *             International Standard Book
     *             Number of a book.
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * The `getTitle` function in Java returns the title of an object.
     * 
     * @return The `title` attribute of the current object is being returned.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * The `setTitle` function in Java sets the title of an object.
     * 
     * @param title The `setTitle` method sets the title of an object to the value
     *              passed as a parameter.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The `getAuthor()` function in Java returns the author associated with the
     * object.
     * 
     * @return An instance of the `Author` class is being returned.
     */
    public Author getAuthor() {
        return this.author;
    }

    /**
     * The function sets the author of a book to the specified author object.
     * 
     * @param author The `setAuthor` method takes an `Author` object as a parameter
     *               and sets the `author`
     *               instance variable of the class to the provided `Author` object.
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * The `toString` method overrides the default implementation to return a string
     * representation of a
     * Book object including its ISBN, title, and author.
     * 
     * @return A string representation of a Book object is being returned. The
     *         string includes the ISBN,
     *         title, and author of the book.
     */
    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author.toString() + "]";
    }
}
