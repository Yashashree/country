/**
 * Created by USER on 1/12/2015.
 */
public class Pound extends Currency{

    Pound()
    {
        currencyName="pound";
        symbol="p";
    }
    public String getCurrency(String country)
    {
        return country+"Pound";
    }
}
