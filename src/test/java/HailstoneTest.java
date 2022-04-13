import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HailstoneTest{
    @Test public void test1(){
        assertEquals("3 10 5 16 8 4 2 ",Hailstone.sequence(3));
    }
    @Test public void test2() {
        assertEquals("16 8 4 2 ",Hailstone.sequence(16));
    }
}