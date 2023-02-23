package exercise6;

public class ex6ChristmasTree {

    public static void PrintChristmasTree(int RowNum) {
        if (RowNum > 2) {
            for (int i = 1; i <= RowNum; i++) {
                for (int j = RowNum - i; j > 0; j--) {
                    System.out.print(" "); // spaces, or use string.repeat
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* "); // stars for each line
                }
                System.out.println();
            }
        } else System.out.println("Tree must have a size of at least 3 ");
    }
}
