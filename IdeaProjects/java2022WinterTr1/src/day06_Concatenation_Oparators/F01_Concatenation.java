package day06_Concatenation_Oparators;

public class F01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        // variable'lerin degerlerini degistirmeden
        //asagıdaki ifadeleri, bu variable'ları kullanarak yazdırın

        // Java5Guzel

        System.out.println(str1+sayi1+str2);

        // 2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2); //2Guzel15

        //Java22

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); //Java22
        //53Guzel
        System.out.println(sayi1+(sayi2+str2));//53Guzel
        System.out.println(""+sayi1+sayi2+str2); //53Guzel

        /*
        eger tamamen satılardan olusan bir string varsa ve biz bunu int'a cevirmek istersek
        Integer.valueof(str)


        bir sayiyi string'e cevirmek istersem
        ""+sayi
         */




    }
}
