import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum;
    @Before
    public void setUp() throws Exception {
        sum = new Sum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        assertEquals(sum.add(4,5), 9);
        assertNotEquals(sum.add(7,9), 6);
    }

    @Test
    public void times() {
        assertSame(sum.times(5,5), 25);
    }

    @Test
    public void sub() {
    }
}