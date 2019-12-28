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
public final class Karatsuba implements Multiply {

    private final long a;
    private final long b;

    public Karatsuba(final long a, final long b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public long multiply() {
        return this.multiply(this.a, this.b);
    }

    private int countOfDigits(long x) {
        int counter = 0;
        while (x > 0) {
            counter++;
            x /= 10;
        }
        return counter;
    }

    public long multiply(long a, long b) {

        int x = countOfDigits(a);
        int y = countOfDigits(b);
        int max = Math.max(x, y);
        if (max < 11) {
            return a * b;
        }
        
        max /= 2;
        long base = (long) Math.pow(10, max);

        long i = a / base;
        long j = a % base;
        long k = b / base;
        long l = b % base;
        long ik = multiply(i, k);
        long jl = multiply(j, l);
        long ijkl = multiply((i + j), (k + l));
        ijkl -= (ik + jl);

        return (long) (ik * Math.pow(base, 2) + ijkl * base + jl);
    }

}
