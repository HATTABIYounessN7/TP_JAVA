public class NombreNegatifException extends Exception {
    int val;

    public NombreNegatifException(String msg, int val) {
        super(msg);
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }
}
