public class CompteBancaire {
    private int id;
    private double solde;
    private String nomTitulaire;

    public CompteBancaire(int id, double solde, String nomTitulaire) {
        this.id = id;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public void depot(double val) {
        this.setSolde(this.getSolde() + val);
    }

    public void retirer(double val) throws FondsInsuffisantsException {
        if (this.getSolde() - val < 0) {
            throw new FondsInsuffisantsException("Insufficient Funds.");
        }

        this.setSolde(this.getSolde() - val);
    }

    public void affichage() {
        System.out.println("Solde: " + this.getSolde());
    }

    public boolean transfer(CompteBancaire compte, double val)
            throws FondsInsuffisantsException, CompteInexistantException {
        if (compte == null) {
            throw new CompteInexistantException("Account does not exist.");
        }
        if (this.getSolde() - val < 0) {
            throw new FondsInsuffisantsException("Insufficient funds.");
        }

        compte.setSolde(compte.getSolde() + val);
        this.setSolde(this.getSolde() - val);
        return true;
    }
}
