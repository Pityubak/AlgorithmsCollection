/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.math.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author Pityubak
 */
public class RandomArrayTest {

    public RandomArrayTest() {
    }

    /**
     * Test of generateArray method, of class RandomArray.
     */
    @Test
    public void testGenerateArrayInvalidLength() {
        IllegalArgumentException assertThrows
                = assertThrows(IllegalArgumentException.class, new RandomArray(-1)::generateArray);
        System.out.println(assertThrows);
    }

    /**
     * Test of generateArray method, of class RandomArray.
     */
    @Test
    public void testGenerateArrayLength() {
        RandomArray instance = new RandomArray(10);
        int result = instance.generateArray().length;
        assertEquals(10, result);

    }

    /**
     * Test of generateArray method, of class RandomArray.
     */
    @Test
    public void testGenerateArray_int_int() {

        int min = -100;
        int max = 100;
        RandomArray instance = new RandomArray(25);
        int[] result = instance.generateArray(min, max);
        int lowest = 0;
        int highest = 0;
        for (int i = 0; i < result.length; i++) {
            if (lowest > result[i]) {
                lowest = result[i];
            }
            if (highest < result[i]) {
                highest = result[i];
            }
        }
        assertTrue(lowest >= min && highest <= max);
    }

}
