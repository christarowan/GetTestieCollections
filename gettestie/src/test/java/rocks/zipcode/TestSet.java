package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestSet {

    @Test
    public void testSetAdd() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        assertEquals(numbers.size(), 2);

    }

    @Test
    public void testSetRemove() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.remove(1);
        assertEquals(numbers.contains(1), false);

    }

    @Test
    public void testSetContains() {
        HashSet<String> quiltBlocks = new HashSet<>();
        quiltBlocks.add("Nine Patch");
        quiltBlocks.add("Pinwheel");
        quiltBlocks.add("Star");
        quiltBlocks.remove("Nine Patch");
        assertEquals(quiltBlocks.contains("Nine Patch"), false);
    }


    @Test
    public void testSetSize() {
        HashSet<String> quiltBlocks = new HashSet<>();
        quiltBlocks.add("Nine Patch");
        quiltBlocks.add("Pinwheel");
        quiltBlocks.add("Star");
        quiltBlocks.remove("Nine Patch");
        assertEquals(quiltBlocks.size(), 2);
    }
    }
