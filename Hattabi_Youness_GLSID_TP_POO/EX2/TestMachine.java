public class TestMachine {
    /**
     * The main function sets the maximum number of products, creates two machine
     * instances, produces
     * products using the machines, and then prints the total number of products
     * produced.
     */
    public static void main(String[] args) {
        MachineProduction.setmaxPrdoucts(100);

        MachineProduction machine1 = new MachineProduction();
        MachineProduction machine2 = new MachineProduction();

        machine1.produce(30);
        machine2.produce(50);
        machine1.produce(40);

        System.out.println("Total Prdoucts: " + MachineProduction.getTotalProducts());
    }
}
