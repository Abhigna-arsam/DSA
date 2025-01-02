//Using recursion
// Check if a number is prime.
// Keep a count of primes found.
// Stop when the n-th prime is reached.
// Consider edge cases: n=1: The output should be 2 (the first prime).Large n: Ensure the solution is efficient.

public class NthPrimeNo {
    
        public static boolean isPrime(int num, int divisor) {
            if (num < 2) {
                return false;
            }
            if (divisor * divisor > num) {
                return true;
            }
            if (num % divisor == 0) {
                return false;
            }
            return isPrime(num, divisor + 1);
        }
    
        public static int findNthPrime(int n, int currentNumber, int count) {
            if (count == n) {
                return currentNumber - 1;
            }
            if (isPrime(currentNumber, 2)) {
                count++;
            }
            return findNthPrime(n, currentNumber + 1, count);
        }
    
        public static int nthPrime(int n) {
            return findNthPrime(n, 2, 0);
        }
    
        public static void main(String[] args) {
            // Test cases
            System.out.println(nthPrime(1));  // Output: 2
            System.out.println(nthPrime(5));  // Output: 11
            System.out.println(nthPrime(10)); // Output: 29
        }
    }

//Sieve of Eratosthenes

// public class NthPrimeNumber {
//     public static int nthPrime(int n) {
//         // Choose a large enough limit to find the nth prime
//         int maxLimit = n * (int) (Math.log(n) + Math.log(Math.log(n))) + 10;
//         boolean[] isPrime = new boolean[maxLimit + 1];
        
//         // Initialize all entries as true
//         for (int i = 2; i <= maxLimit; i++) {
//             isPrime[i] = true;
//         }

//         // Apply Sieve of Eratosthenes
//         for (int p = 2; p * p <= maxLimit; p++) {
//             if (isPrime[p]) {
//                 for (int multiple = p * p; multiple <= maxLimit; multiple += p) {
//                     isPrime[multiple] = false;
//                 }
//             }
//         }

//         // Find the nth prime
//         int primeCount = 0;
//         for (int i = 2; i <= maxLimit; i++) {
//             if (isPrime[i]) {
//                 primeCount++;
//                 if (primeCount == n) {
//                     return i;
//                 }
//             }
//         }
//         return -1;  // In case something goes wrong
//     }

//     public static void main(String[] args) {
//         // Test cases
//         System.out.println(nthPrime(1));  // Output: 2
//         System.out.println(nthPrime(5));  // Output: 11
//         System.out.println(nthPrime(10)); // Output: 29
//         System.out.println(nthPrime(100)); // Output: 541
//     }
// }

//steps
// Create a boolean array isPrime[] of size maxLimit
// maxLimit (a sufficiently large number).
// Initialize all entries in isPrime[] to true. A value of true means the index is prime.
// Mark multiples of each prime starting from 2 as false.
// Iterate through isPrime[] to count the prime numbers until the n-th prime is found.
