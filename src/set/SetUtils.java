package set;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246


public class SetUtils<E> {
    /**
     * make new SimpleSet from 2 sets user send, that every element appear only once and return it.
     *
     * @param set1 the first set user want to make union with
     * @param set2 the second set user want to make union with
     * @param <E>  the
     * @return new set that has all elements from both sets and every element appear once.
     */
    public static <E> SimpleSet union(SimpleSet<E> set1, SimpleSet<E> set2) {
        SimpleSet newSet = new SimpleSet<>(set1.size() + set2.size());
        for (int i = 0; i < set1.getElements().length && set1.getElements()[i] != null; i++)
            newSet.add(set1.getElements()[i]);
        for (int i = 0; i < set2.getElements().length && set2.getElements()[i] != null; i++)
            newSet.add(set2.getElements()[i]);
        return newSet;
    }

    /**
     * make new set that has the elements that both sets have in common.
     * @param set1 first set
     * @param set2 second set
     * @return return new set of the elements that both sets have in common.
     * @param <E>
     */
    public static <E> SimpleSet intersection(SimpleSet<E> set1, SimpleSet<E> set2) {
        SimpleSet newSet = new SimpleSet<>(set1.size() + set2.size());
        for (int i = 0; i < set1.getElements().length && set1.getElements()[i] != null; i++)
            if (set2.contains(set1.getElements()[i]))
                newSet.add(set1.getElements()[i]);
        return newSet;
    }

    /**
     *make new set of all element belong only to set 1.
     * @param set1 the set we want to take all "special" elements
     * @param set2 the set we do not want his elements in newset
     * @return new set
     * @param <E>
     */
    public static <E> SimpleSet difference(SimpleSet<E> set1, SimpleSet<E> set2) {
        SimpleSet newSet = new SimpleSet<>(set1.size() + set2.size());
        for (int i = 0; i < set1.getElements().length && set1.getElements()[i] != null; i++)
            if (!set2.contains(set1.getElements()[i]))
                newSet.add(set1.getElements()[i]);
        return newSet;
    }

    /**
     *make new set of all elements that in set 1 or in set 2 but not in both of them.
     * @param set1 first set
     * @param set2 second set
     * @return a new set of elements.
     * @param <E>
     */
    public static <E> SimpleSet symmetricDifference(SimpleSet<E> set1, SimpleSet<E> set2) {
        SimpleSet newSet = new SimpleSet<>(set1.size() + set2.size());
        for (int i = 0; i < set1.getElements().length && set1.getElements()[i] != null; i++) {
            if (!set2.contains(set1.getElements()[i]))
                newSet.add(set1.getElements()[i]);
            if (!set1.contains(set2.getElements()[i]))
                newSet.add(set2.getElements()[i]);
        }
        return newSet;
    }
}