public class MachineProduction {
	private int id;
	private int nbProducts;
	private static int nbMachines = 0;
	private static int totalProducts = 0;
	private static int maxPrdoucts = 0;

	public MachineProduction() {
		this.id = nbMachines + 1;
		nbMachines++;
	}

	public boolean produce(int quantity) {
		if (totalProducts + quantity > maxPrdoucts) {
			System.out.println("Impossible");
			return false;
		}

		this.nbProducts += quantity;
		totalProducts += quantity;
		return true;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNbProducts() {
		return this.nbProducts;
	}

	public void setNbProducts(int nbProducts) {
		this.nbProducts = nbProducts;
	}

	public static int getNbMachines() {
		return nbMachines;
	}

	public static void setNbMachines(int n) {
		nbMachines = n;
	}

	public static int getTotalProducts() {
		return totalProducts;
	}

	public static void setTotalProducts(int t) {
		totalProducts = t;
	}

	public static int getmaxPrdoucts() {
		return maxPrdoucts;
	}

	public static void setmaxPrdoucts(int m) {
		maxPrdoucts = m;
	}

}