/**
 * Bag (collection) API
 * @param <E> class / data type of the items in the stack
 */
public interface Bag<E> extends Iterable<E> {
    /**
     * Add an item to the bag.
     * @param item the item to be added
     */
    void add(E item);

    /**
     * Checks to see if the bag is empty.
     * @return true if the bag is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns a count of the number of items in the bag.
     * @return the number of items in the bag
     */
    int size();
}
