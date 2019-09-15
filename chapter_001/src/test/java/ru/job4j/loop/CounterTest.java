package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void sum30() {
        Counter check = new Counter();
        int res = check.add(0, 10);
        assertThat(res, is(30));
    }
}
