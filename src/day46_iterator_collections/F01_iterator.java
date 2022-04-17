package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class F01_iterator {

    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]


        Iterator itr = liste.iterator(); //  iterator method'unu olusturdugumuz liste objesi
                                         // uzerinden ArrayList class'indan calistiriyoruz

        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
        Iterator itr = liste.iterator();
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde
        calismak icin olusturmus olduk
        biz iterator objesini olustudugumuzda
        iterator collection'in ilk elementinin oncesine gidip bekler


        [ (itr)5, 7, 8, 6, 9]

        itr.hasNext() ====> true   iterator'a yaninda eleman varmi doye sorar true veya false dondurur

        itr.hasNext() ====> iterator bir sonraki elementin yanina gecer
                            ve  uzeridnen gectigi elenti vize dondurur
        [ 5,(itr) 7, 8, 6, 9] ===> bize 5 dondurur

        itr.hasNext() ====>

        [ 5, 7,(itr) 8, 6, 9] ===> bize 7 dondurur

        itr.remove(); // iterator'in elinde olan elementi sildi
        dolayisiyla ust uste iki kere  itr.remove(); kullanilamaz

        once itr.remove(); methodunu calistirip
        iterator'in bir element almasini saglamaliyiz

         */

        System.out.println(itr.hasNext()); // true

        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7
        itr.remove(); //
        System.out.println(liste);

        // itr.remove();

    }
}
