package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void func1() {
      Fitness fit = new Fitness();
      int res = fit.calc(95,90);
      assertThat(res, is(0));
    }
    @Test
    public void func2() {
        Fitness fit = new Fitness();
        int res = fit.calc(90,95);
        assertThat(res, is(1));
    }
    @Test
    public void func3() {
        Fitness fit = new Fitness();
        int res = fit.calc(50,90);
        assertThat(res, is(2));
    }
}
