class Solution {
    public int countPrimes(int n) {

        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];

        // Step 1: assume all are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Step 2: eliminate multiples
        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) { // only if still prime

                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // mark non-prime
                }
            }
        }

        // Step 3: count primes
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}