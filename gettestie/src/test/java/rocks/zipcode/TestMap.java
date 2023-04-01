package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestMap {

    @Test
    public void testMapPut(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Laura", "888-7777");
        assertEquals(map.get("Laura"),"888-7777");
    }

    @Test
    public void testMapSize() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Cathy", "888-5555");
        map.put("Laura", "888-7777");
        assertEquals(map.size(), 2 );
    }

    @Test
    public void testMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Cathy", "888-5555");
        map.put("Laura", "888-7777");
        map.remove("Cathy");
        assertEquals(map.size(), 1);
    }


}
