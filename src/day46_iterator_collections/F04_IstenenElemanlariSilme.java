package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class F04_IstenenElemanlariSilme {
    public static void main(String[] args) {
        /*
        soru3) Bir listedeki istenen sayi araliginda olmayan
        elementleri silen bir program yaziniz...
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 (sinirlar dahil)
        output: [23,40]
         */


        List<Integer> liste= new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator itr = liste.listIterator();

        while (itr.hasNext()){

            Object sayi= itr.next();

            if ((Integer)sayi<20 ||  (Integer)sayi>40){
                itr.remove();
            }

        }
        System.out.println(liste); // [23, 40]
    }
}
