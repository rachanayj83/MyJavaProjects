package com;

public class ReverseStringDriver {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String str = "Hello World!";

        long startTime = System.currentTimeMillis();

        System.out.println(rs.reverse(str));

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

        long startTime1 = System.currentTimeMillis();
        System.out.println(rs.reverse_1(str));
        long stopTime1 = System.currentTimeMillis();
        long elapsedTime1 = stopTime1 - startTime1;
        System.out.println(elapsedTime1);

    }
}
