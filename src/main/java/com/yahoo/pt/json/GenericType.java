package com.yahoo.pt.json;

public class GenericType<T> {
    T t;
    public void set(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
