package rocks.zipcode;

import org.junit.Test;

import java.util.Stack;
import java.util.Vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VectorTest {

    @Test
    public void vectorAdd() {
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        assertEquals((int) numbers.lastElement(),7);


    }

    @Test
    public void vectorRemove() {
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        numbers.remove(2);
        assertEquals((int) numbers.lastElement(),9);


    }
    @Test
    public void lastIndexOf() {
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        assertEquals((int) numbers.size(), 3);


    }
}
