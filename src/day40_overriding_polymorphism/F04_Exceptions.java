package day40_overriding_polymorphism;

public class F04_Exceptions {
    public static void main(String[] args) {

        // String olarak verilen bir sayiyi Integer'a cevirip
        // 2 katina ekranda yazdiralim

        String str="1234a";


        // str icinde sayi olmayan bir karaketer olursa
        // NumberFormatException.forInputString hatasini verir



        try {
            int sayi=Integer.parseInt(str);
            System.out.println("Girilen sayinin 2 kati : " + 2*sayi);
        } catch (Exception e) {
            //  e.printStackTrace();
            System.out.println("giridiginiz string sayi olmayan elementler iceriyor");
        }


    }
}
