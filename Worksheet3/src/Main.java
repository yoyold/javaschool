/*
@yoyold
v1 13.12.22
 */

public class Main {
    public static void main(String[] args) {
        Testex1();
        Testex2();
        Testex3();
        Testex4();


    }

    public static void Testex1(){
        // test for ex1
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(false, true, true));
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(true, true, true));
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(true, true, false));
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(true, false, true));
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(true, false, false));
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(false, false, true));
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(false, false, false));
        System.out.println("Result is : " + ex1BooleanExpr.ExactlyOne(false, true, false));
    }

    public static void Testex2(){
        System.out.println("Is Leapyear: " + ex1LeapYear.isLeapYear(2008));
        System.out.println("Is Leapyear: " + ex1LeapYear.isLeapYear(2009));
        System.out.println("Is Leapyear: " + ex1LeapYear.isLeapYear(2010));
        System.out.println("Is Leapyear: " + ex1LeapYear.isLeapYear(2011));
        System.out.println("Is Leapyear: " + ex1LeapYear.isLeapYear(-2008));
    }

    public static void Testex3(){
        System.out.println("Is Greater: "  + ex3CompareNum.greaterThan(1, 3));
        System.out.println("Is Greater: "  + ex3CompareNum.greaterThan(3, 1));
        System.out.println("Is Greater: "  + ex3CompareNum.greaterThan(3, 3));
    }

    public static void Testex4(){
        System.out.println("Conversion Table");
        System.out.println("------------------");
        System.out.println("Euro");
        System.out.print("Dollar");
        for (int i = 10; i <= 100; i = i+10){
            ex4MoneyConvert.PrintTable(i);
        }
    }
}