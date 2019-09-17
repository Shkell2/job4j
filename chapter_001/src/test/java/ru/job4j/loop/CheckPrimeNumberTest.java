package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void test1() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean res = checkPrimeNumber.check(5);
        assertThat(res, is(true));
    }
    @Test
    public void test2() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean res = checkPrimeNumber.check(4);
        assertThat(res, is(false));
    }
}
