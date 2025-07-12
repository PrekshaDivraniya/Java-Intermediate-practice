import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIsPrimeTest {
    CheckIsPrime checkPrime;

    @BeforeEach
    void init(){
        checkPrime = new CheckIsPrime();
    }

    @Test
    void if1IsGivenItShouldThrowException(){
        assertThrows(InvalidPrimeInputException.class,() -> checkPrime.isPrime(1));
    }

    @Test
    void if0IsGivenItShouldThrowException(){
        assertThrows(InvalidPrimeInputException.class,() -> checkPrime.isPrime(0));
    }

    @Test
    void ifNegativeIsGivenItShouldThrowException(){
        assertThrows(IllegalArgumentException.class,() -> checkPrime.isPrime(-5));
    }

    @Test
    void if23IsGivenItShouldReturnTrue(){
        assertTrue(checkPrime.isPrime(23));
    }

    @Test
    void if91IsGivenItShouldReturnFalse(){
        assertFalse(checkPrime.isPrime(91));
    }

    @Test
    void if2IsGivenItShouldReturnTrue(){
        assertTrue(checkPrime.isPrime(2));
    }

    @Test
    void if97IsGivenItShouldReturnTrue(){
        assertTrue(checkPrime.isPrime(97));
    }
}