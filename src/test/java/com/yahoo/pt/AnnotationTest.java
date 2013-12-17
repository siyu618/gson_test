package com.yahoo.pt;

import java.util.Date;

import org.testng.annotations.Test;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yahoo.pt.json.Student2;

public class AnnotationTest {

    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
            //.setPrettyPrinting()
            .serializeNulls()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

    @Test
    public void testSerialize() {
        Student2 student2 = new Student2("id", "Jone", new Date(123456789L));
        System.out.println(gson.toJson(student2));
        String exp = "{\"Name\":\"Jone\",\"bir\":\"1970-01-02 18:47:36\"}";
        assert exp.equals(gson.toJson(student2));
    }

    @Test
    public void testDeserialize() {
        String exp = "{\"Name\":\"Jone\",\"bir\":\"1970-01-02 18:47:36:123\"}";
        Student2 student2 = gson.fromJson(exp, Student2.class);
        System.out.println(student2);
    }
}
