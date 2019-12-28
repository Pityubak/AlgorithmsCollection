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
package com.pityubak.math.numbertheory;

/**
 *
 * @author Pityubak
 */
public class BaseLeastCommonMultiple extends ExtremeValue implements LeastCommonMultiple {

    private final int a;
    private final int b;

    public BaseLeastCommonMultiple(int a, int b) {
        super(a, b);
        this.a = a;
        this.b = b;

    }

    @Override
    public int lcm() {
        return this.getLcm(this.a, this.b);
    }

    private int getLcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        int higher = this.getMaximum();
        int lower = this.getMinimum();
        int retValue = higher;
        while (retValue % lower != 0) {
            retValue += higher;
        }
        return retValue;
    }

}
