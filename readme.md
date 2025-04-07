<h1>Documentation of JAVA TPs</h1>
<h2>TP POO</h2>
<h3>Exercice 1: </h3>
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

<h3>Exercice 2: <h3>

<p>class MachineProduction</p>

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

<h3>Exercice 3: </h3>
<p>classe Person</p>
<p>
    toString(): The `toString` method overrides the default implementation to return a formatted string
                representation of an object's attributes. 
                This `toString()` method is returning a formatted string representation of an object's
                attributes, including name, surname, email, telephone number, and birth date.
</p> 
<p>classe Adherent</p>
<p>
    toString(): The `toString` method is overridden to return a formatted string representation of an `Adherent`
                object including its attributes.
                The `toString()` method is being overridden to return a string representation of an object
                of the `Adherent` class. The returned string includes the values of the `numAdherent`, `name`,
                `surname`, `email`, `tel`, and `birthDate` properties of the object.
</p>
<p>classe Author</p>
<p>
    toString(): The `toString` method in Java returns a string representation of an object's attributes. 
                The `toString` method is being overridden to return a string representation of an object
                of the class `Adherent`. The returned string includes the values of the `numAuthor`, `name`,
                `surname`, `email`, `tel`, and `birthDate` attributes of the `Adherent` object.
</p>
<p>classe Book</p>
<p>
    toString(): The `toString` method overrides the default implementation to return a string representation of a
                Book object including its ISBN, title, and author. 
                A string representation of a Book object is being returned. The string includes the ISBN,
                title, and author of the book.
</p>
<p>classe App</p>
<p>The main function creates an instance of an Adherent and a Book, then prints them out.</p>
