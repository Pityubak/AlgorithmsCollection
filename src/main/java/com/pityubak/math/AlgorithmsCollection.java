/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.math;

import com.pityubak.math.sort.QuickSort;
import com.pityubak.math.sort.Sort;
import com.pityubak.math.utils.RandomArray;

/**
 *
 * @author Pityubak
 */
public class AlgorithmsCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new RandomArray(2000).generateArray(-1000, 1000);
        Sort sorting = new QuickSort(array);
        sorting.sort();
        print(sorting.getArray());
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
