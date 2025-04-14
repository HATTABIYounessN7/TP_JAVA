import java.util.List;

public interface IMetier<T> {
    /**
     * Adds an element of type T to the collection.
     *
     * @param t the element to be added
     */
    public void add(T t);

    /**
     * Retrieves all elements of type T.
     *
     * @return a list containing all elements of type T.
     */
    public List<T> getAll();

    /**
     * Finds an entity by its unique identifier.
     *
     * @param id the unique identifier of the entity to find
     * @return the entity corresponding to the given identifier, or null if not
     *         found
     */
    public T findById(long id);

    /**
     * Deletes an entity identified by the given ID.
     *
     * @param id the unique identifier of the entity to be deleted
     */
    public void delete(long id);
}