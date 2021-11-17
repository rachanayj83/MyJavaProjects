package com;

public class ReverseString {

        String reverse(String str){
            StringBuilder input = new StringBuilder();
            return input.append(str).reverse().toString();
        }

        String reverse_1(String str){
            int len = str.length();
            String reversed = "";

            for (int i=len-1; i >=0; i--){
                //adds each character in front of the existing string
                reversed = reversed + str.charAt(i);
            }

            return reversed;
        }
}


