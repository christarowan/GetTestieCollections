package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestList {
    @Test
    public void testArrayListAdd() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("llama");
        assertEquals(animals.size(), 1);
    }

    @Test
    public void testArrayListRemove() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("llama");
        animals.add("tapir");
        assertEquals(animals.remove("tapir"), true);
    }

    @Test
    public void testArrayListContains() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("llama");
        animals.add("tapir");
        assertEquals(animals.contains("llama"), true);
    }

    @Test
    public void testArrayListEmpty() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("llama");
        animals.add("tapir");
        animals.remove("llama");
        animals.remove("tapir");
        assertEquals(animals.isEmpty(), true);
    }
}
