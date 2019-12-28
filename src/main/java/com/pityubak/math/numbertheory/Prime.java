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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Pityubak
 */
public final class Prime {

    private final int p;

    public Prime(int p) {
        this.p = p;
    }

    public boolean isPrime() {
        int n = Math.abs(this.p);
        if (n % 2 == 0 || n == 1) {
            return false;
        }
        int index = (int) Math.sqrt(n) + 1;
        for (int i = 3; i < index; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> sieveOfErastosthenes() {
        List<Integer> listOfPrimes = new ArrayList<>();
        boolean[] prime = new boolean[this.p + 1];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < this.p; i++) {
            if (prime[i]) {
                for (int j = 2 * i; j <= this.p; j += i) {
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

    public int[] leastPrimeFactor() {
        int[] prime = new int[this.p + 1];

        prime[1] = 1;

        for (int i = 2; i < prime.length; i++) {

            if (prime[i] == 0) {
                prime[i] = i;
                for (int j = 2 * i; j <= this.p; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }
        return prime;
    }

    public List<Integer> factorize() {
        List<Integer> list = new ArrayList<>();
        int[] primes = leastPrimeFactor();
        int n = this.p;
        while (n != 1) {
            list.add(primes[n]);
            n /= primes[n];
        }
        return list;
    }

    public Map<Integer, Integer> getPrimeFactors() {
        int number = this.p;

        Map<Integer, Integer> primeMap = new HashMap<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                Integer power = primeMap.get(i);
                if (power == null) {
                    power = 0;
                }
                primeMap.put(i, power + 1);
                number /= i;
            }
        }

        return primeMap;
    }
}
