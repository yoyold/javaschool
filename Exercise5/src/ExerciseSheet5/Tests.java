package ExerciseSheet5;

public class Tests {

    public static void testex1(){
        System.out.println("GCD of 1 and 2 is "  + Ex1GCD.greatestCommonDivisor(1,2));
        System.out.println("GCD of 23 and 36 is "  + Ex1GCD.greatestCommonDivisor(24,36));
    }

    public static void testex2(){
        System.out.println("Is Lagerregal a palindrome? " + Ex2Palindrome.IsPalindrome("Lagerregal"));
        System.out.println("Is Haus a palindrome? " + Ex2Palindrome.IsPalindrome("Haus"));
    }

    public static void testex3(){
        System.out.println("Is 1 prime? " + Ex3IsPrime.isPrime(1));
        System.out.println("Is 7 prime? " + Ex3IsPrime.isPrime(7));
        System.out.println("Is 8 prime? " + Ex3IsPrime.isPrime(8));
    }

}
