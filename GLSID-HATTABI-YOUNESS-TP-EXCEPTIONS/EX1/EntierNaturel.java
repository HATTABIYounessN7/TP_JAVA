public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) {
        try {
            this.setVal(val);
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getVal());
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (this.getVal() < 0) {
            throw new NombreNegatifException("Number can't be less than zero", val);
        }
        this.val = val;
    }

    public void decrementer(int val) throws NombreNegatifException {
        if (this.getVal() - val < 0) {
            throw new NombreNegatifException("Impossible to decrement, result is negative", this.getVal() - val);
        }

        this.setVal(this.getVal() - val);
    }

    public static void main(String[] args) {
        EntierNaturel n = new EntierNaturel(0);
        EntierNaturel m = new EntierNaturel(1);
        EntierNaturel p = new EntierNaturel(-1);

        /*
         * System.out.println(n.getVal());
         * System.out.println(m.getVal());
         */
        try {
            m.decrementer(1);
            System.out.println(m.getVal());
        } catch (NombreNegatifException e) {
            e.getMessage();
            e.getVal();
        }

        try {
            n.decrementer(1);
            System.out.println(m.getVal());
        } catch (NombreNegatifException e) {
            e.getMessage();
            e.getVal();
        }
    }
}
