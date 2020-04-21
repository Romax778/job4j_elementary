package ru.job4j.test;
import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas3Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 7};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}
