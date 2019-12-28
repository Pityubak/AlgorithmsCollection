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
public class BaseLeastCommonMultipleTest {

    public BaseLeastCommonMultipleTest() {
    }

    /**
     * Test of lcm method, of class BaseLeastCommonMultiple.
     */
    @Test
    public void testLcm() {
        BaseLeastCommonMultiple instance = new BaseLeastCommonMultiple(5, 7);
        int result = instance.lcm();
        assertEquals(35, result);
    }

}
