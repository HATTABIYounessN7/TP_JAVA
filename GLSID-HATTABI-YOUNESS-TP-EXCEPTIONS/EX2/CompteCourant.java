public class CompteCourant extends CompteBancaire {
    private int decouvertAutorise;

    public CompteCourant(int id, double solde, String nomTitulaire, int decouvertAutorise) {
        super(id, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    public int getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(int decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public void retirer(int val) throws FondsInsuffisantsException {
        if (val > this.getSolde() - this.getDecouvertAutorise()) {
            throw new FondsInsuffisantsException("Insufficient Funds.");
        }

        this.setSolde(this.getSolde() - val);
    }
}
