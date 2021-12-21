package com.example.exercises.ReverseString;

import org.springframework.stereotype.Component;

@Component
public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length == 0) return;
        int y = s.length - 1;
        int x = 0;
        char ch;
        while (x < y) {
            ch = s[x];
            s[x] = s[y];
            s[y] = ch;
            x++;
            y--;
        }
    }
}
