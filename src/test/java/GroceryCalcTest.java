import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class GroceryCalcTest {

    @Test
    void testFinnishBundle() {
        Locale locale = new Locale("fi", "FI");
        ResourceBundle rb = ResourceBundle.getBundle("LanguageBundle", locale);
        assertEquals("Kuinka monta tuotetta haluaisit ostaa?", rb.getString("productAmount"));
    }

    @Test
    void testEnglishBundle() {
        Locale locale = new Locale("en", "UK");
        ResourceBundle rb = ResourceBundle.getBundle("LanguageBundle", locale);
        assertEquals("How many products would you like to buy?", rb.getString("productAmount"));
    }

    @Test
    void testJapaneseBundle() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("LanguageBundle", locale);
        assertEquals("商品をいくつ購入されますか", rb.getString("productAmount"));}

    @Test
    void testSwedishBundle() {
        Locale locale = new Locale("sv", "SE");
        ResourceBundle rb = ResourceBundle.getBundle("LanguageBundle", locale);
        assertEquals("Hur många produkter vill du köpa?", rb.getString("productAmount"));}

    @Test
    void testCart() {

    }
}