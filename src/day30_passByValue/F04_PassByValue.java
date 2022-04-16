package day30_passByValue;

public class F04_PassByValue {
    /*
      eger bir method'da yapiland egisikli kalici ollmasini istiyorsak
      iki yontem kullanabiliriz
      1- variable'i class level'da static olarak olusturabiliriz
     */

    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {

        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();

    }
    public static void  kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100 ;
        System.out.println("indiirmli fiyat : " + etiketFiyati);


    }

}
