package org.javafuzzing.fuzzer;

/**
 * Created by vicky on 2/27/2017.
 */
public class Test {
    public Test(String a) {
        String s = new String(a);
        System.out.println(s);
    }
    public Test(){
        System.out.println("Empty constructor.");
    }
}
