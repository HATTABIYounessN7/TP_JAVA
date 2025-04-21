public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(int id, double solde, String nomTitulaire, double tauxInteret) {
        super(id, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        double interet = this.getSolde() * this.getTauxInteret();
        this.depot(interet);
    }

    @Override
    public void affichage() {
        super.affichage();
        System.out.println("Taux d'intérêt: " + this.getTauxInteret());
    }

}
