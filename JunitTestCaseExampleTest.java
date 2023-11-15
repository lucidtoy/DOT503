import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JunitTestCaseExampleTest {

    // Test case 1 - Pass
    @Test
    public void testAdd() {
        JunitTestCaseExample example = new JunitTestCaseExample();
        example.add("John");
        assertEquals(1, example.sizeOfStudent());
    }

    // Test case 2 - Pass
    @Test
    public void testRemove() {
        JunitTestCaseExample example = new JunitTestCaseExample();
        example.add("John");
        example.remove("John");
        assertEquals(0, example.sizeOfStudent());
    }

    // Test case 3 - Pass
    @Test
    public void testAdd_x() {
        JunitTestCaseExample example = new JunitTestCaseExample();
        example.add_x("Jane");
        assertEquals(1, example.sizeOfStudent());
    }

    // Test case 4 - Fail
    @Test
    public void testAdd_fail() {
        JunitTestCaseExample example = new JunitTestCaseExample();
        example.add("John");
        assertEquals(0, example.sizeOfStudent());
    }

    // Test case 5 - Fail
    @Test
    public void testRemove_fail() {
        JunitTestCaseExample example = new JunitTestCaseExample();
        example.add("John");
        example.remove("Jane");
        assertEquals(0, example.sizeOfStudent());
    }
}
