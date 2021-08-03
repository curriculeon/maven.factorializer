package com.github.curriculeon.factorializer;

import com.github.curriculeon.Factorializer;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 8:42 PM
 */
public class NextTest {
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

    @Test
    public void test1() {
        test(1, 1, 1);
    }


    @Test
    public void test2() {
        test(10, 1, 1);
    }

    @Test
    public void test3() {
        test(10, 3, 6);
    }

    @Test
    public void test4() {
        test(10, 4, 24);
    }

    @Test
    public void test5() {
        test(10, 5, 120);
    }

}
