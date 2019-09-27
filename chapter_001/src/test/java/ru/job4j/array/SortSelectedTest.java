package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void test1() {
        assertThat(SortSelected.sort(new int[] {3, 2, 5}), is(new int []{2, 3, 5}));
    }
    @Test
    public void test2() {
        assertThat(SortSelected.sort(new int[] {3, 2, -1, 5, 4}), is(new int []{-1, 2, 3, 4, 5}));
    }
}
