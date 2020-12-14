/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.util;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.hamcrest.CoreMatchers.is;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.MatcherAssert;

@RunWith(JUnitParamsRunner.class)
public class MathUtilTest3 {

    @Test
    @Parameters(
            {
                "1, 1, 2",
                "2, 2, 4",
                "3, 3, 6",
                "6, 6, 12"
            }
    )
    public void getTotalTest(int a, int b, int expected) {
        Assert.assertEquals(expected, MathUtil.getTotal(a, b));
    }

    @Test
    @Parameters(
            {
                "2, true",
                "3, false",
                "4, true",
                "5, false"
            }
    )
    public void isEvenNumberTest(int a, boolean Expected) {
        MatcherAssert.assertThat(MathUtil.IsEvenNumber(a), is(Expected));
        // thu tu co phan dao nguoc, actual truoc, Matcher (expected matcher) sau
    }

    @Test
    @Parameters(method = "param_isEvenNumberTest")
    public void countCharacterTest(String str, int count) {
        Assert.assertEquals(count, MathUtil.countCharacter(str));
    }

    private Object[] param_isEvenNumberTest() {
        return new Object[]{
            new Object[]{"hello, my name is vuong", 23},
            new Object[]{"thang cu chuoi", 14},
            new Object[]{"thang hoc ngu", 13}
        };
    }
}
