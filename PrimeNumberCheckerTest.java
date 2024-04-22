package org.example;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberCheckerTest {

    @Test
    public void testPrimeNumberChecker() {
        assertTrue(PrimeNumberChecker.isPrime(2));
        assertTrue(PrimeNumberChecker.isPrime(3));
        assertFalse(PrimeNumberChecker.isPrime(4));
        assertTrue(PrimeNumberChecker.isPrime(5));
        assertFalse(PrimeNumberChecker.isPrime(-1));
        assertFalse(PrimeNumberChecker.isPrime(0));
        assertFalse(PrimeNumberChecker.isPrime(1));
    }
}
