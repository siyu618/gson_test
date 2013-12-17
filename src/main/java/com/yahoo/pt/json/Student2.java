package com.yahoo.pt.json;

import java.util.Date;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student2 {
    private String id;
    @Expose
    private String name;
    @Expose
    @SerializedName("bir")
    private Date birthDay;

    public Student2(String id, String name, Date birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Student2#birthDay=" + birthDay + ",name=" + name + ",id=" + id;
    }
}
