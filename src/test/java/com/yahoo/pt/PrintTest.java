package com.yahoo.pt;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yahoo.pt.json.Student;

public class PrintTest {
    Student student = new Student("jone", 15);

    private static String _FUNC_() {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        return traceElement.getMethodName();
    }

    @Test
    public void nonPettyPrint() {

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        System.out.println(_FUNC_());
        System.out.println(gson.toJson(student));
    }

    @Test
    public void pettyPrint() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(_FUNC_());
        System.out.println(gson.toJson(student));
    }

    @Test
    public void nullPrint() {
        Gson gson = new GsonBuilder().serializeNulls().create();
        System.out.println(_FUNC_());
        System.out.println(gson.toJson(gson.toJson(student)));
    }

    @Test
    public void nullPettyPrint() {
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        System.out.println(_FUNC_());
        System.out.println(gson.toJson(gson.toJson(student)));
    }

}
