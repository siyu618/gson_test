package com.yahoo.pt.json;

public class BagOfPrimitives {
    private int value1 = 1;
    private String value2 = "abc";
    private transient Integer value3 = null;
    private String value4 = null;
    public BagOfPrimitives() {
      // no-args constructor
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("value1:" + value1);
        buffer.append(",");
        buffer.append("value2:" + value2);
        buffer.append(",");
        buffer.append("value3:" + value3);
        buffer.append(",");
        buffer.append("value4:" + value4);
        return buffer.toString();
    }
  }