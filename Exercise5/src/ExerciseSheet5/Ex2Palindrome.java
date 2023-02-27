package ExerciseSheet5;

public class Ex2Palindrome {

    //check if a given string is a palindrome
    public static boolean IsPalindrome(String Input){

        StringBuilder ReversedInput = new StringBuilder();

        int InputLength = Input.length();

        for (int i = (InputLength - 1); i >= 0; --i) {
            ReversedInput.append(Input.charAt(i));
        }

        return Input.equalsIgnoreCase(ReversedInput.toString());
    }
}
