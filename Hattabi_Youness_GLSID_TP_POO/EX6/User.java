public class User {
    private String username;

    public User() {
        this("");
    }

    public User(String username) {
        this.username = username;
    }

    public void lendObject(Lendable lendable) {
        lendable.lend();
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
