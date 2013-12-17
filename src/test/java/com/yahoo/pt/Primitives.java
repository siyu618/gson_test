package com.yahoo.pt;

import org.testng.annotations.Test;

import com.google.gson.Gson;

public class Primitives {
    private Gson gson = new Gson();

    @Test
    public void testSerialization() {
        System.out.println(gson.toJson(1)); // ==> 1
        System.out.println(gson.toJson("123")); // ==> "123"
        System.out.println(gson.toJson(new Long(10))); // ==> 10
        int[] values = { 1 };
        System.out.println(gson.toJson(values));  // ==> [1]
    }

    @Test
    public void testDeserialization() {
        int one = gson.fromJson("1", int.class);
        System.out.println(one);
        Integer iOne = gson.fromJson("1", Integer.class);
        System.out.println(iOne);
        Long lOne = gson.fromJson("1", Long.class);
        System.out.println(lOne);
        Boolean bFalse = gson.fromJson("false", Boolean.class);
        System.out.println(bFalse);
        String str = gson.fromJson("\"abc\"", String.class);
        System.out.println(str);
       // String anotherStr = gson.fromJson("[\"abc\"]", String.class);
       // System.out.println(anotherStr);
    }

}
