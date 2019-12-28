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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pityubak
 */
public final class SieveOfErastosthenes {

    private final int n;

    public SieveOfErastosthenes(final int n) {
        this.n = n;
    }

    public List<Integer> sieveOfErastosthenes() {
        List<Integer> listOfPrimes = new ArrayList<>();
        boolean[] prime = new boolean[this.n];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < this.n; i++) {
            if (prime[i]) {
                for (int j = 2 * i; j <= this.n; j += i) {
                    prime[j] = false;
                }
            }

        }
        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                listOfPrimes.add(i);
            }
        }
        return listOfPrimes;
    }
}
