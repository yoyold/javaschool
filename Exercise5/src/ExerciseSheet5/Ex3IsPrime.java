package ExerciseSheet5;

public class Ex3IsPrime {

    // check if a given number can only be divided by 1 and itself
    public static boolean isPrime(int num) {
        // 1 and negative values are not prime
        if (num <= 1) {
            return false;
        }
        // a number can’t have factor greater than sqrt(n)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
