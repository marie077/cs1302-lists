package cs1302.p3;

// DO NOT MODIFY THIS FILE!
// IF YOU DO, THEN YOUR ASSIGNMENT WILL NOT BE GRADED.

/**
 * Contains utility methods for the project.
 * @author Michael E. Cotterell
 */
public class Utility {

    /**
     * Returns a new array of the specified type and length.
     * @param <T> specified type
     * @param length specified length
     * @return new array of the specified type and length
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] newArray(int length) {
	return (T[]) new Object[length];
    } // newArray

} // Utility

