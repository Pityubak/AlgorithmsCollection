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
public class SteinGreatestCommonDivisorTest {

    public SteinGreatestCommonDivisorTest() {
    }

    /**
     * Test of gcd method, of class SteinGreatestCommonDivisor.
     */
    @Test
    public void testGcd() {

        SteinGreatestCommonDivisor instance = new SteinGreatestCommonDivisor(72, 71);
        int result = instance.gcd();
        assertEquals(1, result);

    }

}
