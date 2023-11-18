package SE320_HW4c_WR;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Internationalization {
	
    public static void main(String[] args) {
    	
        // a. Format number 12345.678 in the United Kingdom locale with two digits after the decimal point
    	
        double number = 12345.678;
        NumberFormat UKLocale = NumberFormat.getInstance(Locale.UK);
        //setting to two digits
        UKLocale.setMaximumFractionDigits(2);
        String formattedNumberUK = UKLocale.format(number);
        System.out.println("UK locale: " + formattedNumberUK + ("\n"));

        // b. Format number 12345.678 in U.S. currency
        
        NumberFormat USCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedNumberUS = USCurrency.format(number);
        System.out.println("U.S. currency: " + formattedNumberUS + ("\n"));

        // c. Parse '12,345.678' into a number
        
        String preParseNumber = "12,345.678";
        try {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
            Number parsedNumber = numberFormat.parse(preParseNumber);
            double parsedDouble = parsedNumber.doubleValue();
            System.out.println("Parsed number: " + parsedDouble);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
