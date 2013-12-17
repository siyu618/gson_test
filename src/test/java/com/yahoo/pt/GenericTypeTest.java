package com.yahoo.pt;

import java.lang.reflect.Type;
import java.util.Collection;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yahoo.pt.json.GenericType;
import com.yahoo.pt.json.Student;

public class GenericTypeTest {
    private Gson gson = new Gson();
    @Test
    public void testSerialization() {
        Student student = new Student("Jone", 15);
        GenericType<Student> genericType = new GenericType<Student>();
        genericType.set(student);
        String str = gson.toJson(genericType);
        String exp = "{\"t\":{\"name\":\"Jone\",\"age\":15}}";
        assert exp.equals(str);
    }

    @Test
    public void testDeserialization() {
        String exp = "{\"t\":{\"name\":\"Jone\",\"age\":15}}";
        Type type = new TypeToken<GenericType<Student>>(){}.getType();
        GenericType<Student> genericType = gson.fromJson(exp, type);
        System.out.println(genericType);
        // output: name:Jone,age:15

    }
}
