package rocks.zipcode;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class TestDeque {

    @Test
    public void testDequeContains() {
        Deque<String> weddingGuests
            = new LinkedList<>();
        weddingGuests.add("Sam");
        weddingGuests.add("Manya");
        weddingGuests.add("Monique");
        weddingGuests.addLast("Carolyn");
        assertEquals(weddingGuests.contains("Carolyn"), true);
    }

    @Test
    public void testDequeElement() {
        Deque<String> weddingGuests
            = new LinkedList<>();
        weddingGuests.add("Sam");
        weddingGuests.add("Manya");
        weddingGuests.add("Monique");
        weddingGuests.addLast("Carolyn");
        assertEquals(weddingGuests.element(), "Sam");
    }


}
