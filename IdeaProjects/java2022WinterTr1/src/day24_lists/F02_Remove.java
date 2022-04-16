package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class F02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        // remove (istenenObjeck) method'u istenen elementi kaldirip
        // bize true/false doner
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // method'u boolean bir variable'a atayabilirsiniz
        boolean sonuc = isimler.remove("Oguzhan"); // [Aykut, Yusuf, Ilker]

        // sonucu kullaniciya yazdirmak istiyorsaniz
        // if/else ile istediginiz degerlendirmeyi yapabilirsiniz

        sonuc= isimler.remove("Berk");
        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        }else{
            System.out.println("istediginiz isim listede olmadigindan silinmedi");
        }

        // remove (index) yazdigimizda sildim/silmedim ihtimali kalmaz
        // bize remove edilen elementi doner

        // System.out.println(isimler.remove(1)); // Yusuf'u siler ve delil oalrak Yusuf ismini bize dondurur
        isimler.remove(1);



        // yazdirsakta yazdirasakta liste degisti ve 1. index'dekşi atama degisti
        System.out.println(isimler);
        // [Aykut, Ilker]






    }

}