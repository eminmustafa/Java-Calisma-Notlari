package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class F04_length {
    public static void main(String[] args) {


        // kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length()); //0

        String str2=null;
        System.out.println(str2);

        // System.out.println(str2.length()); // calistirdigimizda hata verir

        String str3;
        // System.out.println(str3);
        // str3 ile str2 'ye deger atanmamıstır
        // str2 null pointer ile isaretlediginden java durumun altında oldugunu bilir
        // ve geriye kalan kodun calismasina engel olamaz
        // ancak str3 te bir deger atamasi olmayinca javva altini kirmizi cizer
        // ve bu durum duzeltilinceye kadar kodun geriye klaninin calismasinada iizn vermez






    }

}
