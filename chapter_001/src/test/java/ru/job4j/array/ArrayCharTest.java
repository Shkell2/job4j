package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ArrayCharTest {
    @Test
    public void test1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean res = ArrayChar.startsW(word, pref);
        boolean expected = true;
        assertThat(res, is(expected));
    }
    @Test
    public void test2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean res = ArrayChar.startsW(word, pref);
        boolean expected = false;
        assertThat(res, is(expected));
    }
}
