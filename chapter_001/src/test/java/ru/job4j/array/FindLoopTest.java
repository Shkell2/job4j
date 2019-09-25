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
    @Test
    public void test3() {
        int[] input = new int[] {5, 10, 3, 9, 12, 2, 9};
        int value = 9;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void test4() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 5;
        int start = 2;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

}
