import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the IMetier interface for managing Produit objects.
 * This class provides methods to add, retrieve, find, and delete products
 * from an internal list.
 * 
 * @author Hattabi Youness
 * @param <Produit> The type of objects managed by this implementation.
 */
public class MetierProduitImpl implements IMetier<Produit> {

    private List<Produit> produits = new ArrayList<>();

    @Override
    public void add(Produit t) {
        produits.add(t);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        produits.remove(findById(id));
    }
}