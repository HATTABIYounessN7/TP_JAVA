public class User {
    private String username;

    public User() {
        this("");
    }

    public User(String username) {
        this.username = username;
    }

    /**
     * Allows a user to lend an object that implements the Lendable interface.
     *
     * @param lendable The object to be lent. This object must implement the
     *                 Lendable interface.
     *
     * @return This method does not return a value.
     *
     */
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
