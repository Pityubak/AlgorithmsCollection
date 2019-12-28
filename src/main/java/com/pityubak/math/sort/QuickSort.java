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
package com.pityubak.math.sort;

/**
 *
 * @author Pityubak
 */
public final class QuickSort implements Sort {

    private final int[] array;
    private final int left;
    private final int right;

    public QuickSort(int[] array) {
        this.array = array;
        this.left = 0;
        this.right = this.array.length - 1;
    }

    @Override
    public void sort() {
        this.sort(array, left, right);
    }

    private int fragments(int[] array, int left, int right) {
        int temp = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {

            if (array[j] <= temp) {
                i++;
                this.swap(array, i, j);
            }
        }
        this.swap(array, i + 1, right);
        return i + 1;
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = fragments(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot + 1, right);
        }
    }

    @Override
    public int[] getArray() {
        return array;
    }

}
