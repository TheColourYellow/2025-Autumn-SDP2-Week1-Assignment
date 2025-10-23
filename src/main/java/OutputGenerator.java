import java.util.Locale;
import java.util.ResourceBundle;

public class OutputGenerator {
    public ResourceBundle getBundle(String lang, String country) {
        Locale locale = new Locale(lang, country);
        return ResourceBundle.getBundle("LanguageBundle", locale);
    }
    public void getIntro(ResourceBundle rb) {
        System.out.println(rb.getString("intro"));
    }
    public String getProductAmount(ResourceBundle rb) {
        return rb.getString("productAmount");
    }
    public String getProductCost(ResourceBundle rb) {
        return rb.getString("productCost");
    }
    public String getUnitAmount(ResourceBundle rb) {
        return rb.getString("unitAmount");
    }
    public String getTotalCost(ResourceBundle rb) {
        return rb.getString("totalCost");
    }
    public String getCurrencySymbol(ResourceBundle rb) {
        return rb.getString("currencySymbol");
    }
}
