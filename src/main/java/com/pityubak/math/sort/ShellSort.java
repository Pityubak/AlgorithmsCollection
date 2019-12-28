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
public final class ShellSort implements Sort {

    private final int[] array;

    public ShellSort(final int[] array) {
        this.array = array;
    }

    @Override
    public void sort() {
        int n = this.array.length;
        for (int i = n / 2; i > 0; i /= 2) {
            for (int j = i; j < n; j++) {
                int temp = this.array[j];
                int k;
                for (k = j; k >= i && this.array[k - i] > temp; k -= i) {
                    this.array[k] = this.array[k - i];
                }
                this.array[k] = temp;
            }
        }
    }

    @Override
    public int[] getArray() {
        return array;
    }
    

}
