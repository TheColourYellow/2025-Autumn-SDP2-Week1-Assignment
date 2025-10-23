import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GroceryCalc {

    public static void main(String[] args) {

        OutputGenerator og = new OutputGenerator();
        ResourceBundle bundle = null;

        Locale locale = Locale.getDefault();
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select your preferred language");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");
        String language = sc.nextLine();


        switch (language) {
            case "1":
                bundle = og.getBundle("en", "UK");
                og.getIntro(bundle);
                break;
            case "2":
                bundle = og.getBundle("fi", "FI");
                og.getIntro(bundle);
                break;
            case "3":
                bundle = og.getBundle("sv", "SE");
                og.getIntro(bundle);
                break;
            case "4":
                bundle = og.getBundle("ja", "JP");
                og.getIntro(bundle);
                break;
            default:
                System.out.println("Invalid selection");
        }
        System.out.println(og.getProductAmount(bundle));
        int productAmount = sc.nextInt();
        double totalCost = 0;
        for (int i = 0; i < productAmount; i++) {
            System.out.println(og.getProductCost(bundle));
            double cost = sc.nextInt();
            System.out.println(og.getUnitAmount(bundle));
            int units = sc.nextInt();
            totalCost += cost * units;
        }
        System.out.println(og.getTotalCost(bundle)+ " " + totalCost + " " + og.getCurrencySymbol(bundle));


    }
}
