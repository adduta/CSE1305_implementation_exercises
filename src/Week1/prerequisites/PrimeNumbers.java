package Week1.prerequisites;

class PrimeNumbers {
    /**
     * Checks whether the given integer value is a prime number.
     *
     * @param n integer value to be checked if it is a prime number or not
     * @return returns true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {

        if ( n <= 1 ) return false;
        //if ( n == 1) return true;
        for ( int i = 2; i <= n/2; i++ ){
            if ( n % i == 0 ) return false;
        }
        return true;
    }

    /**
     * Counts and returns the number of prime numbers that are less or equal
     * than the given integer value.
     *
     * @param n integer value defining an upper bound on the set of prime number to count
     * @return returns the number of prime numbers that are less or equal than n
     */
    public static int numPrimes(int n) {
        int count = 0;
        for ( int i = 1; i <= n; i++ ){
            if (isPrime(i)) count++;
        }
        return count;
    }
}
