/*
 * The MIT License
 *
 * Copyright 2019 Pityubak.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pityubak.math.search;

/**
 *
 * @author Pityubak
 */
public class RandomBinarySearch implements Search {

    private final int[] array;
    private int left;
    private int right;

    //Note: array is mutable
    public RandomBinarySearch(int[] array) {
        this.array = array;
        this.left = 0;
        this.right = this.array.length;
    }

    @Override
    public int search(int target) {
        if (right >= left) {
            int pivot = left + (int) (Math.random() * (right - left));
            if (array[pivot] == target) {
                return pivot;
            }
            if (array[pivot] > target) {
                this.right = pivot - 1;

            } else {
                this.left = pivot + 1;
            }
            return search(target);
        }
        return -1;
    }

}
