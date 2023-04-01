package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class TestQueue {

    @Test
    public void testQueueRemove() {
        Queue<String> quiltBlocks
            = new LinkedList<>();
        quiltBlocks.add("Nine Patch");
        quiltBlocks.add("Pinwheel");
        quiltBlocks.add("Star");
        quiltBlocks.remove("Nine Patch");
        assertEquals(quiltBlocks.size(), 2);
    }

    @Test
    public void testQueueSize() {
        Queue<String> quiltBlocks
            = new LinkedList<>();
        quiltBlocks.add("Nine Patch");
        quiltBlocks.add("Pinwheel");
        quiltBlocks.add("Star");
        quiltBlocks.add("Tumbling Block");
        assertEquals(quiltBlocks.size(), 4);
    }

    @Test
    public void testQueuePeek() {
        Queue<String> quiltBlocks
            = new LinkedList<>();
        quiltBlocks.add("Nine Patch");
        quiltBlocks.add("Pinwheel");
        quiltBlocks.add("Star");
        quiltBlocks.add("Tumbling Block");
        assertEquals(quiltBlocks.peek(), "Nine Patch");
    }
}
