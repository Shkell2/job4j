package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int p = 6;
        int k= 2;
        double expected = 2;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual,0.01);
    }
}
