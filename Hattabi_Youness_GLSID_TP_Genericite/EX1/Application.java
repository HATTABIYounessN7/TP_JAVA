import java.util.Scanner;

/**
 * The Application class serves as the entry point for the product management
 * application.
 * It provides a menu-driven interface for users to perform various operations
 * on products,
 * such as adding, deleting, displaying, and searching for products.
 * 
 * Features:
 * - Add a new product with details like ID, name, price, brand, description,
 * and stock quantity.
 * - Delete an existing product by its ID.
 * - Display a list of all available products.
 * - Search for a product by its ID and display its details.
 * - Exit the application.
 * 
 * Usage:
 * - The user interacts with the application through a console-based menu.
 * - Input is taken from the user via the Scanner class.
 * - The application uses the MetierProduitImpl class to manage product
 * operations.
 * 
 * Note:
 * - Ensure that the input provided by the user is valid to avoid runtime
 * exceptions.
 * - The application runs in a loop until the user chooses to exit.
 */
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetierProduitImpl metierProduit = new MetierProduitImpl();
        boolean continuer = true;

        while (continuer) {
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit");
            System.out.println("3. Afficher la liste des produits");
            System.out.println("4. Rechercher un produit par ID");
            System.out.println("5. Quitter");

            System.out.print("Choisissez une option: ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Id de produit: ");
                    long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nom du produit: ");
                    String nom = sc.next();
                    sc.nextLine();
                    System.out.print("Prix du produit: ");
                    double prix = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Marque du produit: ");
                    String marque = sc.next();
                    sc.nextLine();
                    System.out.print("Description du produit: ");
                    String description = sc.next();
                    sc.nextLine();
                    System.out.print("Quantité en stock du produit: ");
                    int inStock = sc.nextInt();
                    sc.nextLine();
                    metierProduit.add(new Produit(id, nom, prix, marque, description, inStock));
                    System.out.println("Produit ajouté avec succès.");
                    break;
                case 2:
                    System.out.println("ID du produit que vous souhaitez supprimer :");
                    long idPourSupprimer = sc.nextLong();
                    sc.nextLine();
                    metierProduit.delete(idPourSupprimer);
                    System.out.println("Produit supprimé avec succes.");
                    break;
                case 3:
                    System.out.println("Produits: ");
                    for (Produit produit : metierProduit.getAll()) {
                        System.out.println(produit);
                    }
                    break;
                case 4:
                    System.out.println("ID du produit que vous souhaitez trouver :");
                    long idPourRechercher = sc.nextLong();
                    sc.nextLine();
                    System.out.println(metierProduit.findById(idPourRechercher));
                    break;
                case 5:
                    System.out.println("Au revoir.");
                    continuer = false;
                    break;
            }
        }
    }
}
