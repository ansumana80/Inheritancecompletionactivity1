import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0.0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places

        DecimalFormat df2 =  new DecimalFormat("#.00");

        df2.setMaximumFractionDigits(1);
        df2.setMinimumFractionDigits(2);
        df2.setRoundingMode(RoundingMode.HALF_UP);
        return df2.format(price);

    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}