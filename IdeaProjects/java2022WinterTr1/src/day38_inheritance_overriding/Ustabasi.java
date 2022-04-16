package day38_inheritance_overriding;

import java.util.ArrayList;
import java.util.List;

public class Ustabasi extends Isci {

    public  String statu="Ustabasi";
    public  String haklar="Ustabasi haftada birgun ekstra tatil hakkina sahiptir";





    public  void  mesai(){
        System.out.println("Ariza varsa Ustabasi ekstra ucret almadan calisir");
    }

    public  void  maasHesaplama(){
        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro = " + (30*8*12) + "Euro maas alir");
    }

    public static void main(String[] args) {
        /*
          Icinde oldugumuz class'dan klasik haliyle bir obje olusturursak
          o  obje ile cagirdigimiz variable ve methodlarda
          Java once icinde bulundugumuz class'a bakar
          aradigimiz class uyesi, icinde oldugumuz class'da varsa
          bize onu getirir
          YOKSA,
          parent class(lar)a bakar, ilk buldugunu getirir
         */
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu); // Ustabasi
        System.out.println(yasin.haklar); // Ustabasi haftada birgun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye); // Isciler yilda bir ikramiye alir
        System.out.println(yasin.izin); //  Tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesaplama();
        yasin.mesai();
        /*
          Eger isci olarak ozelliklerini gormek istersek
          Class adini(data turunu) isci seceriz
         */
        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu); // isci
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye); // Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin); // Tum personel yilda 4 hafta izin kullanabilir
        ahmet.maasHesaplama(); //
        ahmet.mesai();


        /*
          Siz bir objeyi hangi class'dan tanimlarsaniz o class'a ait ozelliklere sahip olur
         */

        Personel adem=new Ustabasi();
        System.out.println(adem.statu); // personel
        System.out.println(adem.haklar); // Tum personel esit haklara sahiptir
        // System.out.println(adem.ikramiye); // CTE verir
        System.out.println(adem.izin); // Tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesaplama(); //
        adem.mesai();

        /*
         Personel adem=new Ustabasi(); bu bir ustabasi objesidir
         Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alir
         Ariza varsa Ustabasi ekstra ucret almadan calisir
         Personel adem=new Personel(); bu personel objesidir
         */


        /*
         Personel adem=new Ustabasi();

         adem'in data turu Personel'dir.
         boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
         Ancak ben adem'in ustabasi oldugunu biliyorum
         cunku constructor'i Ustabasi
         Ama bu olusturma formati ile
         adem'in tum Personel ile birlikte sahip oldugu
         ortak ozellikleri vurgulamak istiyorum

         Bu kullanim seklinde olusturulan obje data turu olarak secilen class
         ve onun parent class'larindaki variable'lari kullanabilir.
         */

    }
}

