/**
 * The Lendable interface represents an item that can be lent and returned.
 * Classes implementing this interface should provide specific implementations
 * for lending and returning the item.
 */
public interface Lendable {
    public void lend();

    public void returnItem();
}
