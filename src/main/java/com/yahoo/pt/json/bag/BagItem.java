package com.yahoo.pt.json.bag;

public class BagItem {
    private String name;
    private BagState state;
    private String size;

    public BagItem(String name, BagState state, String size) {
        this.name = name;
        this.state = state;
        this.size = size;
    }

    @Override
    public String toString() {
        return "BagItem#name=" + name + ",state=" + state + ",size=" + size;
    }
}
