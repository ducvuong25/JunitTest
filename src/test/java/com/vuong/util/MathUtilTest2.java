/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.util;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */
@RunWith(Parameterized.class)
public class MathUtilTest2 {

    private String input;
    private int expected;

    public MathUtilTest2(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"hello world", 11}, {"helloworld", 10}, {"hello", 5}
        });
    }

    @Test
    public void testGetCharacterCount() {
        Assert.assertEquals(expected, MathUtil.countCharacter(input));
    }

}
