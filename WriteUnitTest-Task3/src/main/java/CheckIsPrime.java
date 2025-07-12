public class CheckIsPrime {

    public boolean isPrime(int num) {
        if(num < 0 ) throw new IllegalArgumentException("Negative number is not allowed");
        if(num == 0 || num == 1) throw new InvalidPrimeInputException("Number must be greater than 1 to check for prime");
        return checkPrime(num);
    }

    private boolean checkPrime(int num) {
        for(int i=2;i*i<num;i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
