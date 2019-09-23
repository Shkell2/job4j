package ru.job4j.array;

public class ArrayChar {
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = true;
        for (int j=0; j!=pref.length; j++) {
            if (pref[j] != word[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
