package kyu8;

import java.math.BigInteger;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
      return num > 1 && BigInteger.valueOf(num).isProbablePrime(10);
    }
}
