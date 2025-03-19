public abstract class Figure {
    protected String nom;

    public Figure() {
        this.nom = "Default";
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double surface();

    public abstract double perimetre();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "Nom: " + nom + ", Surface: " + surface() + ", Perimetre: " + perimetre();
    }
}
