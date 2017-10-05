package cs1302.p3;

// DO NOT MODIFY THIS FILE!
// IF YOU DO, THEN YOUR ASSIGNMENT WILL NOT BE GRADED.

/**
 * A box that contains an element. 
 *
 * @param <T> the type of element in this box
 * @author Michael E. Cotterell
 */
public class Box<T> {

    private T elem = null;

    /**
     * Creates a new box.
     */
    public Box() {}

    /** 
     * Creates a new box with the given element. 
     * @param elem element in the box
     */
    public Box(T elem) {
	this.elem = elem;
    } // Box

    /**
     * Return the element in the box.
     * @return the element in the box
     */
    public T get() {
	return elem;
    } // get

    /**
     * Sets the element in the box.
     * @param elem the element in the box
     */
    public void set(T elem) {
	this.elem = elem;
    } // set

} // Box<T>

