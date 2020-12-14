package com.vuong.util;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    @Test
    public void TestGetTotal_01() {
        int total = MathUtil.getTotal(2, 2);
        Assert.assertEquals(4, total);
    }

    @Test
    public void TestGetTotal_02() {
        int total = MathUtil.getTotal(3, 2);
        Assert.assertEquals(5, total);
    }

    @Test
    public void TestGetQuotient_01() {
        int quotient = MathUtil.getQuotient(6, 2);
        Assert.assertEquals(3, quotient);
    }

    @Test
    public void TestGetQuotient_02() {
        int quotient = MathUtil.getQuotient(1, 2);
        Assert.assertEquals(0, quotient);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestGetQuotient_03() {
        MathUtil.getQuotient(10, 0);
    }

    @Test
    public void TestIsEvenNumber_01() {
        boolean IsEvenNumber = MathUtil.IsEvenNumber(10);
        Assert.assertTrue(IsEvenNumber);
    }

    @Test
    public void TestIsEvenNumber_02() {
        boolean IsEvenNumber = MathUtil.IsEvenNumber(9);
        Assert.assertFalse(IsEvenNumber);
    }

    @Test
    public void TestGetUser_01() {
        User user = MathUtil.getUser(1);
        Assert.assertNotNull(user);
    }

    @Test
    public void TestGetUser_02() {
        User user = MathUtil.getUser(4);
        Assert.assertNull(user);
    }

    @Test
    public void TestCountCharacter_02() {
        int count = MathUtil.countCharacter("hello");
        Assert.assertEquals(5, count);
    }

}
