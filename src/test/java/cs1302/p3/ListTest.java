package cs1302.p3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the List interface.
 */
public class ListTest extends TestCase {

    /**
     * Create the test case
     * @param testName name of the test case
     */
    public ListTest(String testName) {
        super(testName);
    } // ListTest

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ListTest.class);
    } // suite

    /**
     * Rigourous Test :-)
     */
    public void testList() {
        assertTrue(true);
    } // testList

} // ListTest

