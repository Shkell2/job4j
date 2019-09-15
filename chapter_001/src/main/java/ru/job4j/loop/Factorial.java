package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
       int mult = 1;
       int i = 1;
       for (;i<=n; i++) {
           mult = i*mult;
    }
        return mult;
    }
}
