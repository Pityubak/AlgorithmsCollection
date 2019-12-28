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
public class EuclidGreatestCommonDivisorTest {
    
    public EuclidGreatestCommonDivisorTest() {
    }
    


    /**
     * Test of gcd method, of class EuclidGreatestCommonDivisor.
     */
    @Test
    public void testGcd() {
        EuclidGreatestCommonDivisor instance = new EuclidGreatestCommonDivisor(60,52);
        int result = instance.gcd();
        assertEquals(4, result);

    }
    
}
