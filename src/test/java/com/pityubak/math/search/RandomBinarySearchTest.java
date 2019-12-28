/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.math.search;

import com.pityubak.math.sort.QuickSort;
import com.pityubak.math.sort.Sort;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pityubak
 */
public class RandomBinarySearchTest {

    public RandomBinarySearchTest() {
    }

    int[] value = new int[]{-987, 45, 333, 326, -55, -8, 123, 122};

    /**
     * Test of search method, of class RandomBinarySearch.
     */
    @Test
    public void testSearchFound() {
        Sort sort = new QuickSort(value);
        sort.sort();
        int target = -55;
        RandomBinarySearch instance = new RandomBinarySearch(value);
        assertEquals(1, instance.search(target));

    }

    /**
     * Test of search method, of class RandomBinarySearch.
     */
    @Test
    public void testSearchNotFound() {
        Sort sort = new QuickSort(value);
        sort.sort();
        int target = -233;
        RandomBinarySearch instance = new RandomBinarySearch(value);
        assertEquals(-1, instance.search(target));
    }

}
