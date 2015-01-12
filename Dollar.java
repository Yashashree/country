/**
 * Created by USER on 1/12/2015.
 */
public class Dollar extends Currency {


    Dollar()
    {
      currencyName="Dollar";
        symbol="$";
    }
    public String getCurrency(String country)
    {
        return country+"Dollar";
    }
}
