package com.yahoo.pt;

import org.testng.annotations.Test;

import com.google.gson.Gson;

public class ArrayTest {
    private Gson gson = new Gson();
    @Test
    public void testSerialization() {
        int[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"abc", "def", "ghi"};
        String intsString = gson.toJson(ints);
        String arrString = gson.toJson(strings);
        String eInts = "[1,2,3,4,5]";
        String eStrs = "[\"abc\",\"def\",\"ghi\"]";
        assert eInts.equals(intsString);
        assert eStrs.equals(arrString);
    }

    @Test
    public void testDeserialization() {
        String eInts = "[1,2,3,4,5]";
        String eStrs = "[\"abc\",\"def\",\"ghi\"]";
        int[] ints = gson.fromJson(eInts, int[].class);
        String[] strs = gson.fromJson(eStrs, String[].class);
    }

    @Test
    public void test(){
        String[][] arr = {{"11"}, {"21", "22"}, {"31", "32", "33"}};
        String strArr = gson.toJson(arr);
        System.out.println(strArr);
        String exp = "[[\"11\"],[\"21\",\"22\"],[\"31\",\"32\",\"33\"]]";
        assert exp.equals(strArr);
        String[][] newArr = gson.fromJson(exp, String[][].class);
        for (String[] arrItem: newArr) {
            for (String iterm: arrItem) {
                System.out.print(iterm + " ");
            }
            System.out.println();
        }
    }
}
