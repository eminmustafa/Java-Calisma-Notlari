package day05_matematikselIslemler;

import java.util.Locale;

public class F04_WapperClass {
    public static void main(String[] args) {

        //primitiv data turu ile non-primitiv arasindaki farklar nelerdi

        String str="Java";
        int sayi=10;


        System.out.println(str.toUpperCase()); // JAVA
        System.out.println(str);

        // non-primitive data turleri data depolamak yaninda bir cok faydali method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar(container)

        // primitive data turleri icinde bazi method'lar gerekli oldugunda
        //java ara bir cozum uretmistir
        // java herbir primitive data turunu   non-primitive olarak  kullanabilmek icin
        // ozel class'lar olusturmus ve bunlara Wrapper Class adinin vermistir


        double sayi2=20.5;


        // sayi2 primitve oldugundan sayi2. dedigimizde hicbir method gelmez

        Double sayi3=15.2;

        // sayi3 wrapper class olan Double class'ini kullandigindan
        // sayi3. dedigimizde bircok method gelir








    }
}
