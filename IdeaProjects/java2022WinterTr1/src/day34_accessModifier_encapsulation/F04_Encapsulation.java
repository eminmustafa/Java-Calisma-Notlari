package day34_accessModifier_encapsulation;

public class F04_Encapsulation {

    public static void main(String[] args) {

        /* bir variables'i ancapsule etmek icin
          1- access modifier'i private yapariz
          2- okuma ve yazma ozelliklerini kullanilasini istedigimiz gibi sinirlayailiriz
             -eger sadece okunmasini istiyorsaniriz getter
             -sadece deger girilebilsin isterseniz setter
             methodlarinda olusturulur


           Bir varible icin hem getter hem setter olusturursaniz
           o variable puclic olmus gibi
           hem okuyup hem de yazilmasini saglayabilirsiniz


           Piyasada developer;lar arasinda genl durum uygulamada boyledir

         */


        F03 obj =new F03();

        System.out.println(obj.getSayi()); // 0

        obj.setStr("Java Java Java");

        System.out.println(obj.getStr()); // Java Java Java

        System.out.println(obj); // sayi=0, str=Java Java Java




    }
}
