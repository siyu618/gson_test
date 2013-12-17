package com.yahoo.pt;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yahoo.pt.json.BagOfPrimitives;

public class BagOfPrimitivesTest {

    private Gson gson = new Gson();

    @Test
    public void testSerialization() {
        BagOfPrimitives obj = new BagOfPrimitives();
        //gson = new GsonBuilder().serializeNulls().create();
        String json = gson.toJson(obj);
        System.out.println(json);
        String expectedString = "{\"value1\":1,\"value2\":\"abc\"}";
        assert expectedString.equals(json);
    }

    @Test
    public void testDeserialization() {
        String json = "{\"value1\":1,\"value2\":\"abc\"}";
        BagOfPrimitives obj = gson.fromJson(json, BagOfPrimitives.class);
        System.out.println(obj);
        // output : value1:1,value2:abc,value3:null,value4:null

    }
}
