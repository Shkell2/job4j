package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 12;
        int y2 = 25;
        double expected = 24.7;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);

    }


}
