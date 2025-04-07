<h1>TP POO</h1>
<h2>Exercice 1: </h2>

<h3>class Compte : </h3>
<p>
    Compte():   The `public Compte()` constructor in the Java class `Compte` is initializing a new instance of
                the `Compte` class. Within this constructor:
                The `solde` attribute is set to 0, indicating an initial balance of 0 for the account.
                The `numero` attribute is set to an empty string, representing the account number.
                The `nbCompte` static variable is incremented by 1, which keeps track of the total number of `Compte` objects created.
</p>
<p>
    getSolde() :    This Java function returns the value of the "solde" attribute.
                    The method `getSolde` is returning the value of the `solde` attribute
</p>
<p>
    setSolde(double solde) :    The function sets the value of the "solde" variable in a Java class.
                    paramters: solde The parameter `solde` in the `setSolde` method is a double type representing the new value to set for the `solde` attribute of the class.
</p>
<p>
    getNumero():    The function `getNumero()` in Java returns the value of the `numero` attribute.
                    The method `getNumero` is returning the value of the instance variable `numero`.
</p>
<p>
    setNumero(String numero):   The function setNumero(String numero) sets the value of the instance variable
                                "numero" in a Java class.
                                parameters: numero The parameter "numero" is a String type that represents a number.
</p>
<p>
    deposit(double amount):     The `deposit` function in Java adds the specified amount to the current balance
                                of an account.
                                parameters: amount The `amount` parameter in the `deposit` method represents the sum of money that is beingdeposited into an account.
</p>
<p>
    withdraw(double amount):    The `withdraw` function in Java checks if the amount to be withdrawn is greater
                                than the current balance and updates the balance accordingly.
                                @param amount The `amount` parameter in the `withdraw` method represents the amount of money that is being withdrawn from an account.
</p>
<p>
    display():  The `display` function in Java prints the account number and balance of an object.
</p>
<p>
    displayNbComptes(): The function `displayNbComptes` prints the number of accounts.

</p>

<h2>Exercice 2: </h2>

<h3>class MachineProduction : </h3>

<p>
    MachineProduction():    The `public MachineProduction()` constructor in the `MachineProduction` class is
                            initializing a new instance of the class.
</p>

<p>
    setmaxPrdoucts(int m):  The function sets the maximum number of products to a specified value.
	                        parameters: m The parameter `m` in the `setmaxPrdoucts` method represents the maximum number of products that can be set.
</p>

<p>
    produce(int quantity):  The `produce` function in Java checks if the total quantity of products exceeds the    
                            maximum limit before adding the specified quantity and returns a boolean value based on the success of the operation.
                            parameters: quantity The `quantity` parameter in the `produce` method represents the number of products that are being produced. It is used to determine if the production of the specified quantity of products is possible based on the current state of the system.
                            The method `produce` returns a boolean value. It returns `true` if the products were
                            successfully produced and added to the total count, and it returns `false` if it was not possible to produce the specified quantity of products due to exceeding the maximum limit.
</p>

<p>
    getTotalProducts(): This function returns the total number of products. 
	                    The method `getTotalProducts()` is returning the value of the variable `totalProducts`.
</p>

<h2>Exercice 3: </h2>
<h3>classe Person : </h3>
<p>
    toString(): The `toString` method overrides the default implementation to return a formatted string
                representation of an object's attributes. 
                This `toString()` method is returning a formatted string representation of an object's
                attributes, including name, surname, email, telephone number, and birth date.
</p> 
<h3>classe Adherent : </h3>
<p>
    toString(): The `toString` method is overridden to return a formatted string representation of an `Adherent`
                object including its attributes.
                The `toString()` method is being overridden to return a string representation of an object
                of the `Adherent` class. The returned string includes the values of the `numAdherent`, `name`,
                `surname`, `email`, `tel`, and `birthDate` properties of the object.
</p>
<h3>classe Author : </h3>
<p>
    toString(): The `toString` method in Java returns a string representation of an object's attributes. 
                The `toString` method is being overridden to return a string representation of an object
                of the class `Adherent`. The returned string includes the values of the `numAuthor`, `name`,
                `surname`, `email`, `tel`, and `birthDate` attributes of the `Adherent` object.
</p>
<h3>classe Book : </h3>
<p>
    toString(): The `toString` method overrides the default implementation to return a string representation of a
                Book object including its ISBN, title, and author. 
                A string representation of a Book object is being returned. The string includes the ISBN,
                title, and author of the book.
</p>
<h3>classe App : </h3>
<p>The main function creates an instance of an Adherent and a Book, then prints them out.</p>

<h2>Exercice 4: </h2>
<h3>class Vehicule : </h3>
<p>
    makeSound():    This method makes a sound, which is currently defined as printing "make sound" to the console.
                    This method is intended to be overridden in subclasses to provide more specific sound behavior.
                    This method does not return any value.
</p>
<p>
    display():  This method displays the name and price of the vehicle.
                This method does not return any value. It prints the name and price of the vehicle to the console.
</p>

<h3>class Car : </h3>
<p>
    makeSound():    Overrides the makeSound method from the Vehicule class to provide a specific sound for a car.
                    This method prints "car says something" to the console when called.
                    This method does not return any value.
</p>
<h3>class Bike : </h3>
<p>
    makeSound():    Overrides the makeSound method from the Vehicule class to provide a specific sound for a bike.
                    This method prints "bike says something" to the console.    
</p>      
<h3>class Plane : </h3>
<p>
    makeSound():    Overrides the makeSound method from the Vehicule class to provide a specific sound for a Plane
                    object.
                    This method does not return any value.
</p>
<h3>classe App : </h3>
<p>    
    This is the main entry point of the application. It creates instances of the
    Plane, Car, and Bike classes,
    calls their methods, and prints out their properties.
</p>
<h2>Exercice 5: </h2>
<h3>class Employee : </h3>
<p>
    Employee(): Constructs a new Employee object with default values.
</p>
<p>
    Employee(String name, String surname, String email, String phone, double salary):        
    Constructs a new Employee object with the provided details.
    parameters: name-The first name of the employee.surname-The last name of the employee. email-The email address of the employee.phone-The phone number of the employee. salary-The salary of the employee.
</p>
<p>
    public abstract double calculateSalary(); : 
        Calculates the salary of the employee based on their specific role and responsibilities.
        This method is abstract and must be implemented by each subclass of Employee.
        returns The calculated salary of the employee.
</p>
<h3>class Ingénieur : </h3>
<p>
    public double calculateSalary():    Calculates the engineer's salary after applying a 15% bonus.
                                        returns the engineer's salary after the bonus has been added.
</p>
<h3>class Manager : </h3>
<p>
    public double calculateSalary():    Calculates the salary of a manager, which includes a 20% bonus on the base  
                                        salary.
                                        returns the total salary of the manager, which is the base salary plus the bonus.
</p>
<h3>class App : </h3>
<p> 
    The main method serves as the entry point for the application.
    It demonstrates the creation of `Engineer` and `Manager` objects,
    calculates their salaries, and prints their details to the console.
    Steps performed:
    1. Creates an `Engineer` object with predefined attributes.
    2. Creates a `Manager` object with predefined attributes.
    3. Calculates and prints the salary of the `Engineer`.
    4. Calculates and prints the salary of the `Manager`.
    5. Prints the string representation of the `Engineer`.
    6. Prints the string representation of the `Manager`.
</p>
<h2>Exercice 6: </h2>
<h3>class Figure : </h3>
<p>surface():  Calculates and returns the surface area of the figure.</p>
<p>perimeter(): Calculates and returns the perimeter of the figure. </p>
<h3>class Circle : </h3>
<p> Circle(String nom, double radius):  Constructs a Circle object with the specified name and radius.
                                        parameters nom-The name of the circle, radius-The radius of the circle.
</p> 
<p>surface(): Calculates the surface area of the circle and returns it.</p>
<p>perimeter(): Calculates the perimeter of the circle and returns it.</p>

<h3>class Rectangle : </h3>
<p> Rectangle(String nom, double width, double height):     Constructs a Rectangle object with the specified name
                                                            width, and height.
                                                            parameters nom-The name of the rectangle.width-The width of the rectangle.height-The height of the rectangle.
</p> 
<p>surface(): Calculates the surface area of the Rectangle and returns it.</p>
<p>perimeter(): Calculates the perimeter of the Rectangle and returns it.</p>
<h3>class App : </h3>
<p>
    The main method serves as the entry point for the application.
    It demonstrates the creation and usage of an array of `Figure` objects,
    which includes instances of `Circle` and `Rectangle`. 
    Steps performed:
    1. Initializes an array of `Figure` objects with a size of 4.
    2. Populates the array with two `Circle` objects and two `Rectangle` objects,
        each initialized with specific names and dimensions.
    3. Iterates through the array and prints the details of each `Figure` object
        using their overridden `toString` method. 
    Expected Output:
    The details of each `Figure` object in the array, printed to the console.
</p>
<h2>Exercice 7: </h2>
<h3>interface Lendable : </h3>
<p>
    The Lendable interface represents an item that can be lent and returned.
    Classes implementing this interface should provide specific implementations
    for lending and returning the item.
</p>
<h3>class Book & DVD : </h3>
<p>
    Book(String title, String author):  Constructs a new Book with the specified title and author.
                                        parameters: title-the title of the book. author-the author of the book.
</p>
<p>
    DVD(String title, String director): Constructs a new DVD with the specified title and director.
                                        parameters: title-the title of the DVD. director-the director of the DVD.
<p>
    getIsLent() & setIsLent(Boolean isLent):    getters and setters for the status of the book or the DVD. True if  
                                                they are currently lent, false otherwise.
</p>
<p>
    lend(): Lends the Lendable.
            This method updates the lending status of the Lendable to true and prints a
            message indicating that the Lendable has been lent.
</p>
<p>
    returnItem():   Returns the Lendable to the library.
                    This method updates the lending status of the Lendable to false and prints a
                    message indicating that the Lendable has been returned.
</p>
<h3>class User : </h3>
<p>
    lendObject(Lendable lendable):  Allows a user to lend an object that implements the Lendable interface.
                                    parameters lendable The object to be lent. This object must implement the
                                    Lendable interface.
</p>
<h3>class App : </h3>
<p>  
    The main method demonstrates the functionality of lending and returning items
    (such as books and DVDs) by a user. It performs the following steps:
    1. Creates a User object with the name "John".
    2. Creates a Book object with the title "The Lord of the Rings" and author "J.R.R. Tolkien".
    3. Creates a DVD object with the title "Inception" and director "Christopher Nolan".
    4. Lends the book and DVD to the user using the `lendObject` method.
    5. Prints the lending status of the book and DVD.
    6. Returns the book and DVD using the `returnItem` method.
    7. Prints the updated lending status of the book and DVD after they are returned.
    This method serves as a test to verify the lending and returning functionality of the User, Book, and DVD classes.
</p>
<h2>Exercice 8: </h2>
<h3>class Payment : </h3>
<p>
    Payment(double amount, String transactionId):   Constructs a Payment object with the specified amount and 
                                                    transaction ID.
                                                    parameters: amount-the amount of the payment. transactionId-the unique identifier for the transaction.
</p>
<p>
    processPayment():   Processes the payment by printing a message with the payment amount and
                        transaction ID.
</p>
<h3>class CreditCard : </h3>
<p> 
    CreditCard(String CardNumber, double amount, String transactionId): 
    Constructs a CreditCard object with the specified card number, amount and transaction ID.
    parameters: CardNumber-The credit card number associated with the transaction. amount-the amount of the payment. transactionId-the unique identifier for the transaction.
</p>
<p>
    processPayment():   Processes the payment by printing a message with the credit card number, payment amount and
                        transaction ID.
</p>
<h3>class PayPal : </h3>
<p> 
    PayPal(String email, double amount, String transactionId): 
    Constructs a Paypal object with the specified emaim, amount and transaction ID.
    parameters: email-The email address associated with the PayPal account. amount-the amount of the payment. transactionId-the unique identifier for the transaction.
</p>
<p>
    processPayment():   Processes the payment by printing a message with the email, payment amount and
                        transaction ID.
</p>
<h3>class Commande : </h3>
<p>
    Command(double amount, Payment paymentMethod):  Constructs a new Command object with the specified amount and 
                                                    payment method.
                                                    parameters amount-The total amount of the command. paymentMethod-The payment method used for this command.
</p>
<p>
    pay(): Processes the payment for this command using the specified payment method.
</p>
<h3>class App : </h3>
<p>
    This is the main entry point of the application. It demonstrates the usage of the Command design pattern
    by creating a Command object, setting its amount and payment method, and then invoking the pay method.
</p>

_view code for more detailed docs_
