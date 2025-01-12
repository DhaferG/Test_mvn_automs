package medev.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for DummyClass.
 */
public class DummyClassTest {

    /**
     * Test for the greet method.
     */
    @Test
    public void testGreet() {
        DummyClass dummy = new DummyClass();
        String result = dummy.greet("Alice");
        assertEquals("Hello, Alice!", result, "Greeting message should match.");
    }

    /**
     * Test for the add method.
     */
    @Test
    public void testAdd() {
        DummyClass dummy = new DummyClass();
        int result = dummy.add(2, 3);
        assertEquals(5, result, "Sum should be 5.");
    }
}
