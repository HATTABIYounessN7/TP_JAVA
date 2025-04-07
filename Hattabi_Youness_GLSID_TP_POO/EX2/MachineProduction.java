public class MachineProduction {
	private int id;
	private int nbProducts;
	private static int nbMachines = 0;
	private static int totalProducts = 0;
	private static int maxPrdoucts = 0;

	// The `public MachineProduction()` constructor in the `MachineProduction` class
	// is initializing a new
	// instance of the class. Here's what it does:
	public MachineProduction() {
		this.id = nbMachines + 1;
		nbMachines++;
	}

	/**
	 * The `produce` function in Java checks if the total quantity of products
	 * exceeds the maximum limit
	 * before adding the specified quantity and returns a boolean value based on the
	 * success of the
	 * operation.
	 * 
	 * @param quantity The `quantity` parameter in the `produce` method represents
	 *                 the number of products
	 *                 that are being produced. It is used to determine if the
	 *                 production of the specified quantity of
	 *                 products is possible based on the current state of the
	 *                 system.
	 * @return The method `produce` returns a boolean value. It returns `true` if
	 *         the products were
	 *         successfully produced and added to the total count, and it returns
	 *         `false` if it was not possible
	 *         to produce the specified quantity of products due to exceeding the
	 *         maximum limit.
	 */
	public boolean produce(int quantity) {
		if (totalProducts + quantity > maxPrdoucts) {
			System.out.println("Impossible");
			return false;
		}

		this.nbProducts += quantity;
		totalProducts += quantity;
		return true;
	}

	/**
	 * This Java function returns the id of an object.
	 * 
	 * @return The method `getId()` is returning the value of the `id` field of the
	 *         current object.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * The function setId sets the id of an object to the specified value.
	 * 
	 * @param id The parameter "id" is an integer value that represents the
	 *           identifier of an object.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * The `getNbProducts` function in Java returns the number of products.
	 * 
	 * @return The method `getNbProducts` returns the value of the `nbProducts`
	 *         attribute.
	 */
	public int getNbProducts() {
		return this.nbProducts;
	}

	/**
	 * The function sets the number of products for a given object.
	 * 
	 * @param nbProducts The parameter `nbProducts` represents the number of
	 *                   products. It is used in the
	 *                   `setNbProducts` method to set the value of the `nbProducts`
	 *                   attribute in a class.
	 */
	public void setNbProducts(int nbProducts) {
		this.nbProducts = nbProducts;
	}

	/**
	 * The function `getNbMachines()` returns the number of machines.
	 * 
	 * @return The method `getNbMachines()` returns the value of the static variable
	 *         `nbMachines`.
	 */
	public static int getNbMachines() {
		return nbMachines;
	}

	/**
	 * The function setNbMachines(int n) sets the number of machines to the value of
	 * n.
	 * 
	 * @param n The parameter `n` in the `setNbMachines` method represents the
	 *          number of machines that you
	 *          want to set. This value will be assigned to the `nbMachines`
	 *          variable.
	 */
	public static void setNbMachines(int n) {
		nbMachines = n;
	}

	/**
	 * This function returns the total number of products.
	 * 
	 * @return The method `getTotalProducts()` is returning the value of the
	 *         variable `totalProducts`.
	 */
	public static int getTotalProducts() {
		return totalProducts;
	}

	/**
	 * The function setTotalProducts sets the total number of products to a
	 * specified value.
	 * 
	 * @param t The parameter `t` in the `setTotalProducts` method represents the
	 *          total number of products
	 *          that you want to set. This value will be assigned to the
	 *          `totalProducts` variable.
	 */
	public static void setTotalProducts(int t) {
		totalProducts = t;
	}

	/**
	 * The function `getmaxPrdoucts` returns the value of the variable
	 * `maxPrdoucts`.
	 * 
	 * @return The method `getmaxPrdoucts()` is returning the value of the variable
	 *         `maxPrdoucts`.
	 */
	public static int getmaxPrdoucts() {
		return maxPrdoucts;
	}

	/**
	 * The function sets the maximum number of products to a specified value.
	 * 
	 * @param m The parameter `m` in the `setmaxPrdoucts` method represents the
	 *          maximum number of products
	 *          that can be set.
	 */
	public static void setmaxPrdoucts(int m) {
		maxPrdoucts = m;
	}

}