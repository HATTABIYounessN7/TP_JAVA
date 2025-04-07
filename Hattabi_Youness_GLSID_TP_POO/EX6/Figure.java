public abstract class Figure {
    protected String nom;

    public Figure() {
        this.nom = "Default";
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    /**
     * Calculates and returns the surface area of the figure.
     *
     * @return The surface area of the figure.
     */
    public abstract double surface();

    /**
     * Calculates and returns the perimeter of the figure.
     *
     *
     * This method should be implemented by subclasses to calculate the perimeter of
     * the specific figure.
     *
     * @return The perimeter of the figure. The value returned should be a positive
     *         number.
     */
    public abstract double perimeter();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "Nom: " + nom + ", Surface: " + surface() + ", Perimetre: " + perimeter();
    }
}
