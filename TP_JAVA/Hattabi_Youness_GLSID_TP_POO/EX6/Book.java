public class Book implements Lendable {
    private String title;
    private String author;
    private Boolean isLent = false;

    public Book() {
        this("", "");
    }

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

    public Boolean getIsLent() {
        return this.isLent;
    }

    public void setIsLent(Boolean isLent) {
        this.isLent = isLent;
    }

    @Override
    public void lend() {
        System.out.println("Book lent");
        setIsLent(true);
    }

    @Override
    public void returnItem() {
        System.out.println("Book returned");
        setIsLent(false);
    }
}
