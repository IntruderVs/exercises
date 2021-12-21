package com.example.exercises.ReverseString;

public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length == 0) return;
        int y = s.length - 1;
        int x = 0;
        while (x < y) {
            char ch = s[x];
            s[x] = s[y];
            s[y] = ch;
            x++;
            y--;
        }
    }
}
