package gymnazium.sturova.seminarinf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    private NumberUtils numberUtils;

    @BeforeEach
    void setUp() {
        numberUtils = new NumberUtils();
    }

    @Test
    void countDigits_singleDigit_returnsOne() {
        assertEquals(1, numberUtils.countDigits(5));
    }

    @Test
    void countDigits_zero_returnsOne() {
        assertEquals(1, numberUtils.countDigits(0));
    }

    @Test
    void countDigits_multipleDigits_returnsCorrectCount() {
        assertEquals(3, numberUtils.countDigits(123));
        assertEquals(5, numberUtils.countDigits(12345));
        assertEquals(10, numberUtils.countDigits(1234567890));
    }

    @Test
    void countDigits_negativeNumber_returnsCorrectCount() {
        assertEquals(1, numberUtils.countDigits(-5));
        assertEquals(3, numberUtils.countDigits(-123));
        assertEquals(5, numberUtils.countDigits(-12345));
    }

    @Test
    void countDigits_maxInteger_returnsCorrectCount() {
        assertEquals(10, numberUtils.countDigits(Integer.MAX_VALUE));
    }

    @Test
    void countDigits_minInteger_returnsCorrectCount() {
        assertEquals(10, numberUtils.countDigits(Integer.MIN_VALUE));
    }

    // Tests for countDivisors method

    @Test
    void countDivisors_one_returnsOne() {
        assertEquals(1, numberUtils.countDivisors(1));
    }

    @Test
    void countDivisors_primeNumber_returnsTwo() {
        assertEquals(2, numberUtils.countDivisors(7));
        assertEquals(2, numberUtils.countDivisors(13));
        assertEquals(2, numberUtils.countDivisors(29));
    }

    @Test
    void countDivisors_compositeNumber_returnsCorrectCount() {
        assertEquals(6, numberUtils.countDivisors(12)); // 1, 2, 3, 4, 6, 12
        assertEquals(4, numberUtils.countDivisors(10)); // 1, 2, 5, 10
        assertEquals(8, numberUtils.countDivisors(24)); // 1, 2, 3, 4, 6, 8, 12, 24
    }

    @Test
    void countDivisors_perfectSquare_returnsOddCount() {
        assertEquals(3, numberUtils.countDivisors(4));  // 1, 2, 4
        assertEquals(5, numberUtils.countDivisors(16)); // 1, 2, 4, 8, 16
        assertEquals(9, numberUtils.countDivisors(36)); // 1, 2, 3, 4, 6, 9, 12, 18, 36
    }

    @Test
    void countDivisors_zeroOrNegative_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> numberUtils.countDivisors(0));
        assertThrows(IllegalArgumentException.class, () -> numberUtils.countDivisors(-5));
        assertThrows(IllegalArgumentException.class, () -> numberUtils.countDivisors(-100));
    }

    // Tests for isPrime method

    @Test
    void isPrime_zero_returnsFalse() {
        assertFalse(numberUtils.isPrime(0));
    }

    @Test
    void isPrime_one_returnsFalse() {
        assertFalse(numberUtils.isPrime(1));
    }

    @Test
    void isPrime_two_returnsTrue() {
        assertTrue(numberUtils.isPrime(2));
    }

    @Test
    void isPrime_three_returnsTrue() {
        assertTrue(numberUtils.isPrime(3));
    }

    @Test
    void isPrime_smallPrimes_returnsTrue() {
        assertTrue(numberUtils.isPrime(5));
        assertTrue(numberUtils.isPrime(7));
        assertTrue(numberUtils.isPrime(11));
        assertTrue(numberUtils.isPrime(13));
        assertTrue(numberUtils.isPrime(17));
        assertTrue(numberUtils.isPrime(19));
        assertTrue(numberUtils.isPrime(23));
    }

    @Test
    void isPrime_largePrime_returnsTrue() {
        assertTrue(numberUtils.isPrime(997));
        assertTrue(numberUtils.isPrime(7919));
    }

    @Test
    void isPrime_compositeNumbers_returnsFalse() {
        assertFalse(numberUtils.isPrime(4));
        assertFalse(numberUtils.isPrime(6));
        assertFalse(numberUtils.isPrime(8));
        assertFalse(numberUtils.isPrime(9));
        assertFalse(numberUtils.isPrime(10));
        assertFalse(numberUtils.isPrime(100));
    }

    @Test
    void isPrime_negativeNumbers_returnsFalse() {
        assertFalse(numberUtils.isPrime(-1));
        assertFalse(numberUtils.isPrime(-2));
        assertFalse(numberUtils.isPrime(-7));
        assertFalse(numberUtils.isPrime(-100));
    }

    // Tests for factorial method

    @Test
    void factorial_zero_returnsOne() {
        assertEquals(1, numberUtils.factorial(0));
    }

    @Test
    void factorial_one_returnsOne() {
        assertEquals(1, numberUtils.factorial(1));
    }

    @Test
    void factorial_smallNumbers_returnsCorrectValue() {
        assertEquals(2, numberUtils.factorial(2));
        assertEquals(6, numberUtils.factorial(3));
        assertEquals(24, numberUtils.factorial(4));
        assertEquals(120, numberUtils.factorial(5));
    }

    @Test
    void factorial_largerNumbers_returnsCorrectValue() {
        assertEquals(720, numberUtils.factorial(6));
        assertEquals(5040, numberUtils.factorial(7));
        assertEquals(40320, numberUtils.factorial(8));
        assertEquals(362880, numberUtils.factorial(9));
        assertEquals(3628800, numberUtils.factorial(10));
    }

    @Test
    void factorial_twenty_returnsCorrectValue() {
        assertEquals(2432902008176640000L, numberUtils.factorial(20));
    }

    @Test
    void factorial_negativeNumber_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> numberUtils.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> numberUtils.factorial(-5));
        assertThrows(IllegalArgumentException.class, () -> numberUtils.factorial(-100));
    }
}