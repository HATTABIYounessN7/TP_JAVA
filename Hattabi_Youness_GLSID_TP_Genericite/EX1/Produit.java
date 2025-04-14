public class Produit {
    private long id;
    private String nom;
    private double prix;
    private String marque;
    private String description;
    private int inStock;

    /**
     * Constructs a new Produit object with the specified details.
     *
     * @param id          The unique identifier of the product.
     * @param nom         The name of the product.
     * @param prix        The price of the product.
     * @param marque      The brand of the product.
     * @param description A brief description of the product.
     * @param inStock     The quantity of the product available in stock.
     */
    public Produit(long id, String nom, double prix, String marque, String description, int inStock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.marque = marque;
        this.description = description;
        this.inStock = inStock;
    }

    public Produit() {
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public String getMarque() {
        return marque;
    }

    public String getDescription() {
        return description;
    }

    public int getInStock() {
        return inStock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", marque=" + marque + ", description="
                + description + ", inStock=" + inStock + "]";
    }

}
