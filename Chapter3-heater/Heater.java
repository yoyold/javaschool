
/**
 * @author (L.Dony) 
 * @version (v2 07.12.22)
 */
public class Heater
{
    private float temperature, min, max, increment;

    /**
     * constructor
     */
    public Heater(float starttemp, float maxtemp, float mintemp)
    {
        temperature = starttemp;
        min = mintemp;
        max = maxtemp;
        increment = 5;
        if (!isValidTemperature())
        {
            min = temperature--;
            max = temperature++;
        }
    }
    
    public float getTemp()
    {
        return temperature;
    }
    
    public void setTemp(float newtemp)
    {
        if (isValidTemperature())
        {
            temperature =  newtemp;   
        }
    }


    public void warmer()
    {
        if (temperature  + increment <= max)
        {
            temperature = temperature + increment;
        }
        else
        {
            System.out.println("This would exceed the max temperature!");
        }
    }
    
    public void colder()
    {
        
        if (temperature  + increment >= min)
        {
            temperature = temperature - increment;
        }
        else
        {
            System.out.println("This would exceed the min temperature!");
        }
    }
    
    public void setIncrement(float newinc)
    {
        if (newinc > 0)
        {
            increment = newinc;   
        }
        else 
        {
            System.out.println("increment must be greater than 0!");
        }
    }
    
    // temperature must be between min and max
    public boolean isValidTemperature()
    {
        if (min <= temperature && max >= temperature){
            return true;
        }
        else 
        {
            System.out.println("temperature must be between min and max!");
            return false;   
        }
    }
    
}
