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
public class LeastCommonMultipleWithGCDTest {
    
    public LeastCommonMultipleWithGCDTest() {
    }
    


    /**
     * Test of lcm method, of class LeastCommonMultipleWithGCD.
     */
    @Test
    public void testLcm() {
        LeastCommonMultipleWithGCD instance = new LeastCommonMultipleWithGCD(150,60);
        int result = instance.lcm();
        assertEquals(300, result);

    }
    
}
