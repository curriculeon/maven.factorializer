package com.github.curriculeon.factorializer;

import com.github.curriculeon.Factorializer;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 8:50 PM
 */
public class NextIndexOutOfBoundsExceptionTest {
    private void test(Integer n, Integer depth, Integer expected) {
        test(n.longValue(), depth.longValue(), expected.longValue());
    }

    private void test(Long n, Long depth, Long expected) {
        // given
        Factorializer factorializer = new Factorializer(n);

        // when
        Long actual = null;
        for (int i = 0; i < depth; i++) {
            actual = factorializer.next();
        }

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test1() {
        test(10, 11, null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test2() {
        test(5, 6, null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test3() {
        test(5, 10, null);
    }
}
