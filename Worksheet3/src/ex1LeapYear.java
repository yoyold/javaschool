public class ex1LeapYear {
    public static Boolean isLeapYear(int year) {
        return (year > 0 && (year % 100 == 0 && ((year % 400 == 0) || (year % 4 == 0))));
    }
}