/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.math.sort;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pityubak
 */
public class MaxSortTest {
    
    public MaxSortTest() {
    }
    

    int[] array = new int[]{-99, -67, -10, 0, 2, 3, 8, 34, 444};

    /**
     * Test of sort method, of class MaxSort.
     */
    @Test
    public void testSort() {
        Sort instance = new MaxSort(array);
        instance.sort();
        int[] expected = new int[]{-99, -67, -10, 0, 2, 3, 8, 34, 444};
        assertArrayEquals(expected, instance.getArray());
    }
}
