package exercise5;

public class ex5Minimum {

    // given an array, return the minimum
    public static double ex5FindMinInArray(double[] InputArr) {
        if (InputArr.length > 0) {
            double Minimum = InputArr[0];
            for (int i = 0; i < InputArr.length - 1; i++) {
                if (InputArr[i+1] < InputArr[i]) {
                    Minimum = InputArr[i + 1];
                }
            }
            return Minimum;
        }
        else return -1; // empty array, no handling for negative values
    }

    // part b: use for-each
    public static double ex5FindMinForEach(double [] InputArr) {
        if (InputArr.length > 0) {
            double Minimum = InputArr[0];
            for (double ArrElement : InputArr) {
                if (ArrElement < Minimum) {
                    Minimum = ArrElement;
                }
            }
            return Minimum;
        }
        else return -1; // empty array
    }

}
