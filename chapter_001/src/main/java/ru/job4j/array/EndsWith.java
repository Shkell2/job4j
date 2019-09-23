package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int i=word.length-1;
        for (int j=post.length-1; j>=0; j--) {
            if (post[j] != word[i]) {
                result = false;
                break;
            } else {
                i--;
            }
        }
        return result;
    }
}
