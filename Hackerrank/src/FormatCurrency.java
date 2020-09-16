import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatCurrency {
    public static void main(String args[])
    {

        double payment = 0.999;

        // Write your code here.

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " +  nf.format(payment));

        nf = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        String inrFormat = nf.format(payment);

        System.out.println("India: Rs." + inrFormat.substring(1, inrFormat.length()));

        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nf.format(payment));

        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nf.format(payment) );

    }
}

