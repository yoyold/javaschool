public class ex4MoneyConvert {
    static final double ConversionRate = 1.599;

    public static double euro2dollar(double EuroValue){
        return EuroValue * ConversionRate;
    }

    public static void PrintTable(double EuroValue) {
        System.out.println(EuroValue);
        System.out.print(euro2dollar(EuroValue));
    }
}
