package com.yahoo.pt;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

import org.testng.annotations.Test;
import org.testng.collections.Lists;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yahoo.pt.json.Student;

public class CollectionsTest {
    private Gson gson = new Gson();
    @Test
    public void testSerialization() {
        Collection<Integer> ints = new ArrayList<Integer>();
        ints.add(3);
        ints.add(4);
        ints.add(5);
        String cString = gson.toJson(ints);
        assert "[3,4,5]".equals(cString);
    }

    @Test
    public void testDeserialization() {
        String eInts = "[3,4,5]";
        Type type = new TypeToken<Collection<Integer>>(){}.getType();
        Collection<Integer> intsCollection = gson.fromJson(eInts, type);

        type = new TypeToken<ArrayList<Integer>>(){}.getType();
        ArrayList<Integer> list = gson.fromJson(eInts, type);
    }

    @Test
    public void complexTest(){
        Collection collection = new ArrayList();
        collection.add("123");
        collection.add(4);
        collection.add(new Student("Jone", 15));
        String outString = gson.toJson(collection);
        String exp = "[\"123\",4,{\"name\":\"Jone\",\"age\":15}]";
        assert exp.equals(outString);

    }
}
