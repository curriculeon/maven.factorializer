package com.github.curriculeon.factorializer;

import com.github.curriculeon.Factorializer;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 8:50 PM
 */
public class SolveTest {
    private void test(Integer n, Integer expected) {
        test(n.longValue(), expected.longValue());
    }

    private void test(Long n, Long expected) {
        // given
        Factorializer factorializer = new Factorializer(n);

        // when
        Long actual = factorializer.solve();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        test(1, 1);
    }

    @Test
    public void test2() {
        test(3, 6);
    }

    @Test
    public void test3() {
        test(4, 24);
    }

    @Test
    public void test4() {
        test(5, 120);
    }

    @Test
    public void test5() {
        test(10, 3628800);
    }
}
