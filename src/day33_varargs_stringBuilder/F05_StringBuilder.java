package day33_varargs_stringBuilder;

public class F05_StringBuilder {

    public static void main(String[] args) {
        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karkterleri karsilarstirir
        ayni olan karakterler icin bir sey yazdirmaz
        farli olan iki karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu yazdirir
        tamamen ayni ise boze 0 dondurur

        bir sb ile bir Str'i compare etmek istersek java CTE verir

         */

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2)); //  0

        // System.out.println(sb1.compareTo(str));

        // sb'da equals methodu String'deki == gibi calisir

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true

        System.out.println(sb1.equals(str)); // false

        // System.out.println(sb1==str); // farkli obje turleri oldugu icin java kiyas yapmaz
    }
}
