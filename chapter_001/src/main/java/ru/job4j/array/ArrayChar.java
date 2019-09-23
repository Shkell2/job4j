package ru.job4j.array;

public class ArrayChar {
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;
        int i=0;
        for (int j=0; j!=pref.length; j++) {
            if (pref[j] == word[i]) {
                result = true;
                i++;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
