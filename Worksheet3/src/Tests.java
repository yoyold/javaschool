package testfunctions;

import exercise1.ex1BooleanExpr;
import exercise2.ex1LeapYear;
import exercise3.ex3CompareNum;
import exercise4.ex4MoneyConvert;
import exercise5.ex5Minimum;
import exercise7.ex7WeatherData;
import exercise8.ex8BottlesOfBeer;

public class Tests {

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

    public static void Testex5(){
        double[] TestArray = {4.4, 3.1, 9.0, 2.5, 5.8};
        System.out.println("Minimum of array: " + ex5Minimum.ex5FindMinInArray(TestArray));
        System.out.println("Minimum of array with for-each: " + ex5Minimum.ex5FindMinForEach(TestArray));
    }

    public static void Testex6(){
        exercise6.ex6ChristmasTree.PrintChristmasTree(6);
    }

    public static void Testex7(){
        int[] WeatherData = {42, 38, 48, 41, 60, 60, 63, 54, 51, 66, 62, 68};
        ex7WeatherData.PrintWeatherData(WeatherData);
    }

    public static void Testex8(){
        ex8BottlesOfBeer.PrintBottlesText();
    }
}
