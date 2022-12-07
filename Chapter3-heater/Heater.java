
/**
 * @author (L.Dony) 
 * @version (v1 07.12.22)
 */
public class Heater
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int temperature, min, max, increment;

    /**
     * constructor
     */
    public Heater(int maxtemp, int mintemp)
    {
        temperature = 15;
        min = mintemp;
        max = maxtemp;
        increment = 5;
        if (!isValidTemperature()){
            System.out.println("temperature must be between min and max!");
        }
    }
    
    public int getTemp()
    {
        return temperature;
    }

    public void warmer()
    {
        if (temperature  + increment <= max)
        {
        temperature = temperature + increment;
        }
    }
    
    public void colder()
    {
        {
        if (temperature  + increment >= min)
        temperature = temperature - increment;
        }
    }
    
    public void setIncrement(int newinc)
    {
        increment = newinc;   
    }
    
    public boolean isValidTemperature()
    {
        if (min <= temperature && max >= temperature){
            return true;
        }
        else return false;
    }
    
}
