import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Testing strategy
 *
 * Partition the inputs as follows:
 * text.length()-start: 0, 1, even > 1, odd > 1
 *
 * Include even- and odd-length reversals because
 * only odd has a middle element that doesn't move.
 *
 * Exhaustive Cartesian coverage of partitions.
 */

class StringManipulationTest {

    // covers text.length() = 0,
    //        start = 0 = text.length(),
    //        text.length()-start = 0
    @Test public void testEmpty() {
        assertEquals("", StringManipulation.reverseEnd("", 0));
    }
    @Test public void testSmallLength() {
        assertEquals("1",StringManipulation.reverseEnd("1",1));
    }
    @Test public void testSmallStart() {
        assertEquals("15432", StringManipulation.reverseEnd("12345", 1));
    }
    @Test public void testBigStart() {
        assertEquals("",StringManipulation.reverseEnd("Hello, world", 100));
    }
    @Test public void testOdd(){
        assertEquals("Heldlrow ,ol",StringManipulation.reverseEnd("Hello, world",3));
    }
    @Test public void testEven() {
        assertEquals("Hedlrow ,oll", StringManipulation.reverseEnd("Hello, world", 2));
    }
    @Test public void testBiggerLength(){
        assertEquals("Hellodlrow ,",StringManipulation.reverseEnd("Hello, world",5));
    }
    @Test public void testLengthEqualsToStart()
    {
        assertEquals("Hello, world",StringManipulation.reverseEnd("Hello, world",12));
    }
}