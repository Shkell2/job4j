package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exists(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotExist() {
        boolean result = Triangle.exists(1.5, 2.5, 5.0);
        assertThat(result, is(false));
    }
}