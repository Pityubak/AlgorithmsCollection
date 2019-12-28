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
public final class SteinGreatestCommonDivisor implements GreatestCommonDivisor {

    private final int a;
    private final int b;

    public SteinGreatestCommonDivisor(final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int gcd() {
        return this.getSteinGcd(this.a, this.b);
    }

    private int getSteinGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int i;
        for (i = 0; ((a | b) & 1) == 0; ++i) {
            a >>= 1;
            b >>= 1;
        }
        while ((a & 1) == 0) {
            a >>= 1;
        }
        do {
            while ((b & 1) == 0) {
                b >>= 1;
            }
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            b = (b - a);
        } while (b != 0);

        return a << i;
    }

}
