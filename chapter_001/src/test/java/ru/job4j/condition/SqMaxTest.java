package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(7, 4, 2, 1);
        assertThat(result, is(7));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2, 0);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 9, 5);
        assertThat(result, is(9));
    }
    @Test
    public void whenFourthMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 9, 12);
        assertThat(result, is(12));
    }
    @Test
    public void whenEqual() {
        SqMax check = new SqMax();
        int result = check.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }
}
