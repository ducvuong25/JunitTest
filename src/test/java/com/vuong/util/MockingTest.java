/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author Admin
 */
@RunWith(MockitoJUnitRunner.class)
public class MockingTest {

    @Mock
    HackNASA hackNASA;

    @InjectMocks
    User user;

    @Test
    public void TestMock() {
        Mockito.when(hackNASA.getPassword()).thenReturn(HackNASA.pass);
        
        Assert.assertEquals("xxx", user.getPassword());
    }

}
