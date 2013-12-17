package com.yahoo.pt;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.yahoo.pt.json.Nested;

public class NestedTest {
    private Gson gson = new Gson();
    @Test
    public void testSerialization() {
        Nested nested = new Nested();
        String jsonString = gson.toJson(nested);
        System.out.println(jsonString);
        String expectedString = "{\"a\":\"outer\"}";
        assert expectedString.equals(jsonString);
    }

    @Test
    public void testDeserialization() {
        String json = "{\"a\":\"outer\"}";
        Nested obj = gson.fromJson(json, Nested.class);
        System.out.println(obj);
        // output : a:out

    }
}
