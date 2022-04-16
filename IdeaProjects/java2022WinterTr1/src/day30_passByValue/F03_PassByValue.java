package day30_passByValue;

public class F03_PassByValue {

    public static void main(String[] args) {
        /*
          Java bir pass by value bir proglamlama dilidir
          Yani: bir pirimitive variable'i argument olarak bir method'a yollarsaniz
          Java o variable'i degik, degerini(value) method'a aktarir(pass)
         */

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("İki indirimden sonra main method'da etiket fiyati : " + etiketFiyati);



    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {


        etiketFiyati=etiketFiyati* 0.90;
        System.out.println("Sizin icin %10 indirimli fiyatimiz : " + etiketFiyati);
    }
}
