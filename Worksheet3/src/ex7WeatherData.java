package exercise7;

public class ex7WeatherData {

    public static void PrintWeatherData(int[] DataArr){
        int BarLength = 0;
        PrintWeatherInfoText();
        for (int  i = 0; i < DataArr.length; i++){
            BarLength = DataArr[i] - 35;

            for (int j = 1; j <= BarLength; j++){
                System.out.print("=");
            }
            System.out.println("");
        }
    }

    // print title row
    public static void PrintWeatherInfoText(){
        System.out.println("Average rainfall in mm");
        System.out.println("---------------------------------------------------------");
    }
}
