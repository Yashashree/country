import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 1/12/2015.
 */
public class CurrencyDemo {

    static String countryName;

    public static void main(String args[]) throws IOException {
        readInput();
        checkCountry(countryName);
    }

    private static void readInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        countryName = br.readLine();
    }

    static void checkCountry(String countryName) {

        if (countryName.equalsIgnoreCase("India")) {
            Rupee rupee = new Rupee();
            System.out.println(rupee.getCurrency(countryName));

        } else if (countryName.equalsIgnoreCase("Uk")) {
            Pound pound = new Pound();
            System.out.println(pound.getCurrency(countryName));

        } else if (countryName.equalsIgnoreCase("USA")) {
            Dollar dollar = new Dollar();
            System.out.println(dollar.getCurrency(countryName));

        }

    }
}




