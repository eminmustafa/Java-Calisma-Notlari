package day10_Switch_StringManipulation;

import java.util.Locale;

public class F04_charAt {
    public static void main(String[] args) {

        // String'de herhangi bir karakteri almak istedigimizde
        // o harfin indeksini kullnarak
        // str.charAt(istenenIndex) yazdirabiliriz

        String str="Java Cok Guzel";
        // J yi yazdiralim

        System.out.println(str.charAt(0));

        // G yi yazdiralim
        System.out.println(str.charAt(9));

        // va yazdiralim

        System.out.println(""+ str.charAt(2)+str.charAt(3));

        // cOK seklinde yazdiralim
        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5) +
                           ""+ str.toUpperCase().charAt(6)+
                           str.toUpperCase().charAt(7));



        // son karekteri (harfi) yazdir
        // String' 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1)); // uzunluk -1(dinamic kod yazma özelligi)

        // eger uzunlugu index olarak girersek
        // Java calistiktan sonra hata verir


        System.out.println(str.charAt(14)); // calistirmaz hata veirir indexden dolayi

    }
}
