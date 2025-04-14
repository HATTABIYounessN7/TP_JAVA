<h1>TP Generecite</h1>
<h2>Exercice 1:</h2>
<h3>Class Produit:</h3>
<p>
    Produit(long id, String nom, double prix, String marque, String description, int inStock):
    Constructs a new Produit object with the specified details.
    parameters: id-The unique identifier of the product. nom-The name of the product. prix-The price of the product. marque-The brand of the product. description-A brief description of the product. inStock-The quantity of the product available in stock.
</p>

<h3>Interface IMetier:</h3>
<p>
    public void add(T t):
    Adds an element of type T to the collection.
    parameters: t-the element to be added
</p>

<p>
    public List<T> getAll():
    Retrieves all elements of type T.
    returns a list containing all elements of type T.
</p>

<p>
    public T findById(long id):
    Finds an entity by its unique identifier.
    parameters: id the unique identifier of the entity to find
    returns the entity corresponding to the given identifier, or null if not found
</p>

<p>
    public void delete(long id):
    Deletes an entity identified by the given ID.
    parameters: id the unique identifier of the entity to be deleted
</p>

<h3>Class MetierProduitImpl:</h3>
<p>
    Implementation of the IMetier interface for managing Produit objects.
    This class provides methods to add, retrieve, find, and delete products
    from an internal list.
</p>

<h3>Class Application:</h3>
<p>
    The Application class serves as the entry point for the product management application.
    It provides a menu-driven interface for users to perform various operations
    on products, such as adding, deleting, displaying, and searching for products.

    Features:
    - Add a new product with details like ID, name, price, brand, description,
    and stock quantity.
    - Delete an existing product by its ID.
    - Display a list of all available products.
    - Search for a product by its ID and display its details.
    - Exit the application.

    Usage:
    - The user interacts with the application through a console-based menu.
    - Input is taken from the user via the Scanner class.
    - The application uses the MetierProduitImpl class to manage product
    operations.

    Note:
    - Ensure that the input provided by the user is valid to avoid runtime
    exceptions.
    - The application runs in a loop until the user chooses to exit.

</p>
