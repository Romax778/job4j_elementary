package java;

import org.junit.Test;
import ru.job4j.condition.Max;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }


    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }
}
