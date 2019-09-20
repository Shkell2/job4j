package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class CheckTest {
    @Test
    public void test1() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean res = check.mono(input);
        boolean expected = true;
        assertThat(res, is(expected));
    }
    @Test
    public void test2() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, false};
        boolean res = check.mono(input);
        boolean expected = false;
        assertThat(res, is(expected));
    }
}
