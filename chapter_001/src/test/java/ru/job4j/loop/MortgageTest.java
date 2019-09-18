package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void test1() {
        Mortgage mortgage = new Mortgage();
        int res = mortgage.year(1000, 1200, 1);
        assertThat(res, is(1));
    }
    @Test
    public void test2() {
        Mortgage mortgage = new Mortgage();
        int res = mortgage.year(100, 120, 50);
        assertThat(res, is(2));
    }
}
