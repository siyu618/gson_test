package com.yahoo.pt.json;

public class Nested {
    public String a = "outer";

    @Override
    public String toString() {
        return "a:out";
    }

    class B {

      public String b = "inner";

      public B() {
        // No args constructor for B
      }
    }
}
