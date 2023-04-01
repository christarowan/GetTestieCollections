package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void testStack2() {
        Stack<String> stack = new Stack<>();
        String expected = "test";
        stack.push(expected);
        String actual = stack.pop();
        assertEquals(expected, actual);
    }
    @Test
    public void testStack3() {
        Stack<String> stack = new Stack<>();
        String expected = "test";
        stack.push(expected);
        String actual = stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStack4() {
        Stack<String> stack = new Stack<>();
        String expected = "test";
        stack.push(expected);
        String actual = stack.peek();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testStack5() {
        Stack<String> stack = new Stack<>();
        String test1 = "test1";
        String test2 = "test2";
        String test3 = "test3";
        stack.push(test1);
        stack.push(test2);
        stack.push(test3);
        int index = stack.search(test2);
        assertEquals(2,stack.search(test2));
    }

    // Make a bigger test exercising more Stack methods.....
}
