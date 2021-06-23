import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalulatorTest {

    private StringCalulator manipulatedstring;

    @BeforeEach
    public void setUp() {
        manipulatedstring = new StringCalulator();
    }

    @AfterEach
    public void tearDown() {
        manipulatedstring = null;
    }

    @Test
    public void testAdd1() {
        int length = manipulatedstring.add("-1,-5");
        assertEquals(4, length);
    }
    @Test
    public void testAdd2() {
        int length = manipulatedstring.add("1,2,2000");
        assertEquals(3, length);
    }
}
