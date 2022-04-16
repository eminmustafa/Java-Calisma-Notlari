package day05_matematikselIslemler;

public class F06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";


        // verilen iki String'deki sayilari toplayin

        System.out.println(str1 + str2); // 1234523456

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); // 35801

        // Integer.valueOf(str1)  method'u saece sayisal deger iceren String'lerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa Java hata verir



    }
}
