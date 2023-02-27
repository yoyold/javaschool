package ExerciseSheet5;

public class Ex1GCD {

    // take two numbers and return their greatest common divisor
    public static int greatestCommonDivisor(int m, int n){
        if ( m == 0 ){
            return n;
        }
        else return greatestCommonDivisor(n % m, m);
    }

}
