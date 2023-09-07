package set;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
/**
 * The `SimpleSet` class is an implementation of the `Set` interface that stores elements in an array.
 * It supports adding, removing, and checking for the presence of elements in the set.

 * @param <E> the type of elements stored in the set
 */
public class SimpleSet <E> implements set<E> {

    private E [] elements;
    private int size;
    private int capacity;

    /**
     * Constructs a new `SimpleSet` object with the specified capacity.
     * @param capacity the initial capacity of the set
     */
    public SimpleSet(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.elements = (E[]) new Object[capacity];
    }
    /**
     * Constructs a new `SimpleSet` object with a default capacity of 5.
     */
    public SimpleSet(){
        this.capacity=5;
        this.size=0;
        this.elements = (E[]) new Object[capacity];

    }
    /**
     * Adds the specified element to the set if it is not already present.
     * make the array bigger if its full, by 5.
     * @param element the element to be added to the set
     */
    @Override
    public void add(E element) {
        //check if the new element is in the array.
        boolean isIn=false;
        for (int i =0; elements[i] != null && i < elements.length ;i++){
            //if he is in the array isIn will be true
            if(element.equals(elements[i])) isIn=true;
        }
        if(!isIn){
            if(capacity>size){
                elements[size]=element;
                size++;
            }
            if(capacity==size){
                biggerArr(elements);
                elements[size]=element;
                size++;
            }
        }
    }
    /**
     * Increases the capacity of the internal array by 5.
     * @param elements the array of elements
     */
    public void biggerArr(E [] elements){
        E [] newelements = (E[]) new Object[capacity+5];
        for (int i=0; i<elements.length;i++){
            newelements[i]=elements[i];
        }
        capacity+=5;
        elements=newelements;
    }

    /**
     * Removes the specified element from the set if it is present.
     * @param element the element to be removed from the set
     * @return true if the element was removed, false otherwise
     */
    @Override
    public boolean remove(E element) {
        //check if the new element is in the array.
        boolean isIn=false;
        int place=0;
        for (int i =0; elements[i] != null && i < elements.length ;i++){
            //if he is in the array isIn will be true
            if(element.equals(elements[i])) {
                isIn = true;
                place=i;
            }
        }
        if(isIn) {
//            E temp =(E) new Object();
//            temp = elements[place];
            for (int i=place;i<elements.length && elements[i+1]!=null ;i++){
                elements[i]=elements[i+1];
            }
            elements[size]=null;
            size--;
            return true;
        }
        else return false;
    }

    /**
     * Checks if the set contains the specified element.
     * @param element the element to be checked for presence in the set
     * @return true if the element is present, false otherwise
     */
    @Override
    public boolean contains(E element) {
        for (int i =0; elements[i] != null && i < elements.length ;i++){
            if(element.equals(elements[i])) return true;
        }
        return false;
    }
    /**
     * Returns the number of elements in the set.
     * @return the number of elements in the set
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        if(size==0)return true;
        return false;
    }

    public E[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
