package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void factorial0() {
        Factorial fact = new Factorial();
        int res = fact.calc(0);
        assertThat(res, is(1));
    }
    @Test
    public void factorial1() {
        Factorial fact = new Factorial();
        int res = fact.calc(1);
        assertThat(res, is(1));
    }
    @Test
    public void factorial5() {
        Factorial fact = new Factorial();
        int res = fact.calc(5);
        assertThat(res, is(120));
    }
}
