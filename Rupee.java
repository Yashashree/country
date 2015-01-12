/**
 * Created by USER on 1/12/2015.
 */
public class Rupee extends Currency {

    Rupee()
    {
      currencyName="Rupee";
        symbol="R";
    }

    public String getCurrency(String country)
    {
        return country+"Rupee";
    }
}
