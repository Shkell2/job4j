package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
        @Test
        public void test1() {
            FindLoop findLoop = new FindLoop();
            int[] input = new int[] {5, 10, 3};
            int value = 5;
            int res = findLoop.indexOf(input, value);
            int expected = 0;
            assertThat(res, is(expected));
        }
    @Test
    public void test2() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 4;
        int res = findLoop.indexOf(input, value);
        int expected = -1;
        assertThat(res, is(expected));
    }

}
