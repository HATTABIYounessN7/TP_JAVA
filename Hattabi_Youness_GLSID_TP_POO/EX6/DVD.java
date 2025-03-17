public class DVD implements Lendable {
    private String title;
    private String director;
    private Boolean isLent = false;

    public DVD() {
        this("", "");
    }

    public DVD(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Boolean getIsLent() {
        return this.isLent;
    }

    public void setIsLent(Boolean isLent) {
        this.isLent = isLent;
    }

    @Override
    public void lend() {
        System.out.println("DVD lent");
        setIsLent(true);
    }

    @Override
    public void returnItem() {
        System.out.println("DVD returned");
        setIsLent(false);
    }
}
