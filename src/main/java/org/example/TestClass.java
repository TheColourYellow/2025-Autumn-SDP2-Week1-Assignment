package org.example;

import java.util.Locale;

public class TestClass {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language ");
        String language = sc.nextLine();
        System.out.println("Enter country ");
        String country = sc.nextLine();
        System.out.println("Welcome to localisation " + language + " " + country);

        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("LanguageBundle", locale);
        String message = rb.getString("wish");
        String greeting = rb.getString("greeting");
        System.out.println(greeting + ", " + message);


        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale.getDisplayCountry());
        System.out.println(myLocale.getDisplayLanguage());

        Locale locale = Locale.getDefault();
        System.out.println("Default Local "+ locale);
        */

        //getting all availiable locale from JVM
        Locale [] availiableLocale = Locale.getAvailableLocales();
        for (Locale alocale:availiableLocale) {
            System.out.println("Name of the Locale: " + alocale.getDisplayName());
            System.out.println("Language code " + alocale.getLanguage() + " Country Display " + alocale.getDisplayCountry());
            if (alocale.getScript().equals("")) {
                System.out.println("Selected code " + alocale.getScript() + "Script display Name " + alocale.getDisplayScript());
            }
            if (alocale.getVariant().equals("")) {
                System.out.println("Variant code " + alocale.getVariant() + "Script display Name " + alocale.getDisplayVariant());
            }
            System.out.println("____________________");

        }
    }
}
