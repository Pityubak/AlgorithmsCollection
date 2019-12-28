/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.math.sort;

/**
 *
 * @author Pityubak
 */
public interface Sort {

    void sort();
    
    int[] getArray();

    //Swap
    default void swap(int[] array, int oldIndex, int newIndex) {
        int temp = array[oldIndex];
        array[oldIndex] = array[newIndex];
        array[newIndex] = temp;
    }
}
