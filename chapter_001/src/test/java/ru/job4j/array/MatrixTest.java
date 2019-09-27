package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixTest {
    @Test
    public void test1() {
        Matrix matrix = new Matrix();
        int[][] res = matrix.multiply(2);
        int[][] expect = {
                {1,2},
                {2,4}
        };
        assertThat(res, is(expect));
    }
    @Test
    public void test2() {
        Matrix matrix = new Matrix();
        int[][] res = matrix.multiply(4);
        int[][] expect = {
                {1,2,3,4},
                {2,4,6,8},
                {3,6,9,12},
                {4,8,12,16}
        };
        assertThat(res, is(expect));
    }
}
