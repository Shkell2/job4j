package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class EndsWithTest {
    @Test
    public void test1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l', 'o'};
        boolean res = EndsWith.endsWith(word, post);
        boolean expected = true;
        assertThat(res, is(expected));
    }
    @Test
    public void test2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'a', 'l', 'o'};
        boolean res = EndsWith.endsWith(word, post);
        boolean expected = false;
        assertThat(res, is(expected));
    }
}
