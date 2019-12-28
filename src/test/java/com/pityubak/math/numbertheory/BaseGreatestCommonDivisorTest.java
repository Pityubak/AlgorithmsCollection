/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.math.numbertheory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pityubak
 */
public class BaseGreatestCommonDivisorTest {
    
    public BaseGreatestCommonDivisorTest() {
    }


    /**
     * Test of gcd method, of class BaseGreatestCommonDivisor.
     */
    @Test
    public void testGcd() {
        BaseGreatestCommonDivisor instance = new BaseGreatestCommonDivisor(12,36);
        int result = instance.gcd();
        assertEquals(12, result);

    }
    
}
