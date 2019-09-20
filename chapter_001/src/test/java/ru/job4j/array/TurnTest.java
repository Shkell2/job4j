package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void test1() {
        Turn turn = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int[] res = turn.back(input);
        int[] expected = new int[] {6, 5, 4, 3, 2, 1};
        assertThat(res, is(expected));
    }
    @Test
    public void test2() {
        Turn turn = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] res = turn.back(input);
        int[] expected = new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(res, is(expected));
    }
}
