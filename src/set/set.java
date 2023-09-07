package set;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
//interface about generic class that represents set.
public interface set<E> {

    //add a new element if not in the set
    void add(E element);

    //remove certain element from set
    boolean remove(E element);

    //check if certain element is in the set
    boolean contains(E element);

    //return the size of the set
    int size();

    //check if the set is empty
    boolean isEmpty();
}
