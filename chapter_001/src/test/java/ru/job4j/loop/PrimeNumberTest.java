package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void test1() {
        PrimeNumber primeNumber = new PrimeNumber();
        int res = primeNumber.calc(5);
        assertThat(res, is(3));
    }
    @Test
    public void test2() {
        PrimeNumber primeNumber = new PrimeNumber();
        int res = primeNumber.calc(11);
        assertThat(res, is(5));
    }
    @Test
    public void test3() {
        PrimeNumber primeNumber = new PrimeNumber();
        int res = primeNumber.calc(2);
        assertThat(res, is(1));
    }
}
