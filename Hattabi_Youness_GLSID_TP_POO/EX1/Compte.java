public class Compte {
    private double solde;
    private String numero;
    private static int nbCompte = 0;

    // The `public Compte()` constructor in the Java class `Compte` is initializing a new instance of
    // the `Compte` class. Within this constructor:
    // - The `solde` attribute is set to 0, indicating an initial balance of 0 for the account.
    // - The `numero` attribute is set to an empty string, representing the account number.
    // - The `nbCompte` static variable is incremented by 1, which keeps track of the total number of
    // `Compte` objects created.
    public Compte() {
        this.solde = 0;
        this.numero = "";
        nbCompte++;
    }

    /**
     * This Java function returns the value of the "solde" attribute.
     * 
     * @return The method `getSolde` is returning the value of the `solde`
     *         attribute.
     */
    public double getSolde() {
        return this.solde;
    }

    /**
     * The function sets the value of the "solde" variable in a Java class.
     * 
     * @param solde The parameter `solde` in the `setSolde` method is a double type
     *              representing the
     *              new value to set for the `solde` attribute of the class.
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * The function `getNumero()` in Java returns the value of the `numero`
     * attribute.
     * 
     * @return The method `getNumero` is returning the value of the instance
     *         variable `numero`.
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * The function setNumero(String numero) sets the value of the instance variable
     * "numero" in a Java
     * class.
     * 
     * @param numero The parameter "numero" is a String type that represents a
     *               number.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * The `deposit` function in Java adds the specified amount to the current
     * balance of an account.
     * 
     * @param amount The `amount` parameter in the `deposit` method represents the
     *               sum of money that is
     *               being deposited into an account.
     */
    public void deposit(double amount) {
        this.setSolde(amount + this.getSolde());
    }

    /**
     * The `withdraw` function in Java checks if the amount to be withdrawn is
     * greater than the current
     * balance and updates the balance accordingly.
     * 
     * @param amount The `amount` parameter in the `withdraw` method represents the
     *               amount of money
     *               that is being withdrawn from an account.
     */
    public void withdraw(double amount) {
        if (amount > this.getSolde()) {
            System.out.println("Solde insuffisant");
        } else {
            this.setSolde(this.getSolde() - amount);
        }
    }

    /**
     * The `display` function in Java prints the account number and balance of an
     * object.
     */
    public void display() {
        System.out.println("Numero: " + this.getNumero() + " Solde: " + this.getSolde());
    }

    /**
     * The function `displayNbComptes` prints the number of accounts.
     */
    public static void displayNbComptes() {
        System.out.println("Nombre de comptes: " + nbCompte);
    }

    public static void main(String[] args) {
        Compte c1 = new Compte();
        Compte c2 = new Compte();
        Compte c3 = new Compte();
        Compte.displayNbComptes();
        c1.deposit(1000);
        c2.deposit(2000);
        c3.deposit(3000);
        c1.display();
        c2.display();
        c3.display();
        c1.withdraw(500);
        c2.withdraw(2500);
        c3.withdraw(500);
        c1.display();
        c2.display();
        c3.display();
    }
}