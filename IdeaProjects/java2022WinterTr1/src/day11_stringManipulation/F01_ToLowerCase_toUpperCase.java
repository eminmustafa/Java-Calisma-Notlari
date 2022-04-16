package day11_stringManipulation;

import java.util.Locale;

public class F01_ToLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        // biz string method'larini arka araya kullanbiliriz
        // messela ikinci kelimenin ilk harfini kucuk olarak yazdiralim


        // str.charAt(5); boyle yazdigimizda sonuc artık string degil char olacaktir
        // dolayisiyla string'de yapmak istedigimiz tum degisiklikleri
        // once yapıp sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); // JAVA GUZELDİR

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));




    }
}
