<h1>TP Generecite</h1>
<h2>Exercise 1:</h2>
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

<h2>Exercise 2:</h2>
<h3>Class Animal:</h3>

<p>
    The {@code Animal} class represents a generic animal with a name.
    It provides methods to get and set the name of the animal, as well as a method to simulate the animal speaking.
    This class can be extended to represent specific types of animals.
    Example usage:
    <pre>
        Animal animal = new Animal("Lion");
        animal.parler(); // Output: Je suis un animal
    </pre>
</p>

<h3>Class Chien:</h3>
<p> 
    The Chien class represents a dog, which is a subclass of the Animal class.
    It overrides the parler method to provide a specific implementation for dogs and includes a custom toString method for representing the object as a string.
    Constructors:
    - Chien(): Creates a new Chien instance with default values.
    - Chien(String nom): Creates a new Chien instance with the specified name.
    Methods:
    - parler(): Prints "Wouf" to the console, representing the sound a dog makes.
    - toString(): Returns a string representation of the Chien object, including its name and class type.
</p>
<h3>Class Chat:</h3>
<p>
    The Chat class represents a cat, which is a specific type of Animal.
    It overrides the parler method to provide a cat-specific sound("Miaou") and customizes the toString method to include the class name and the cat's name.
    Constructors:
    - Chat(): Creates a Chat instance with default properties.
    - Chat(String nom): Creates a Chat instance with the specified name.
    Methods:
    - parler(): Prints "Miaou" to the console, representing the sound a cat makes.
    - toString(): Returns a string representation of the Chat object, including its name and class.
</p>
<h3>Class AnimalerieUtil:</h3>
<p>
    Utility class for managing a collection of animals.
</p>

<p>
    public void afficherAnimaux(List<? extends Animal> liste):
    Displays the list of animals and calls their parler() method.
    parameters: liste A list of objects that extend the Animal class.
</p>

<p>
    public boolean ajouterChien(List<? super Chien> liste):
    Adds a new dog to the provided list.
    parameters: liste A list that can accept objects of type Chien or its superclasses.
    returns true if the dog was successfully added.
</p>

<p>
    public void afficherTout(List<?> liste):
    Displays all elements in the provided list.    
    parameters: liste A list of any type of objects.
</p>

<h3>Class Main:</h3>
<p>
    The Main class demonstrates the usage of generic methods and wildcards
    in Java by working with lists of different types (Chien, Animal, Object).
    It performs the following operations:
    - Creates lists of Chien, Animal, and Object.
    - Adds elements to these lists.
    - Uses the AnimalerieUtil class to:
        - Display animals from lists of Chien and Animal.
        - Add Chien objects to lists of various types.
        - Display all elements from lists of various types.
    Note:
    - The method `afficherAnimaux` is commented out for the list of Object
    because it may not be compatible with the expected type constraints.
</p>
