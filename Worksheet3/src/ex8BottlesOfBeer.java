package exercise8;

public class ex8BottlesOfBeer {

    public static void PrintBottlesText(){
        for (int i = 99; i >= 1; i--){
            System.out.print(i);
            System.out.print(" bottles of beer on the wall, ");
            System.out.print(i);
            System.out.print(" bottles of beer.");
            System.out.println("Take one down, pass it around, ");
            System.out.print(i-1);
            System.out.print(" bottles of beer on the wall. ");
        }
    }


}
