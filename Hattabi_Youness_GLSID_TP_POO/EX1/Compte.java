public class Compte {
    private double solde;
    private String numero;
    private static int nbCompte = 0;

    public Compte() {
        this.solde = 0;
        this.numero = "";
        nbCompte++;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void deposit(double amount) {
        this.setSolde(amount + this.getSolde());
    }

    public void withdraw(double amount) {
        if (amount > this.getSolde()) {
            System.out.println("Solde insuffisant");
        } else {
            this.setSolde(this.getSolde() - amount);
        }
    }

    public void display() {
        System.out.println("Numero: " + this.getNumero() + " Solde: " + this.getSolde());
    }

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