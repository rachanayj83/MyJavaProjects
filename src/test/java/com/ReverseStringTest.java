package com;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @org.junit.jupiter.api.Test
    void reverse() {
        String expectedValue="!dlroW olleH";
        ReverseString rs = new ReverseString();
        String reversed = rs.reverse("Hello World!");
        assertEquals(expectedValue, reversed);
    }

    @org.junit.jupiter.api.Test
    void reverse_1() {
        String expectedValue="ANAVRIN";
        ReverseString rs = new ReverseString();
        String reversed = rs.reverse("NIRVANA");
        assertEquals(expectedValue, reversed);
    }
}