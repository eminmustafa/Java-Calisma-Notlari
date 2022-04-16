package day25_lists;

import java.util.ArrayList;
import java.util.List;

import static day25_lists.F04_ListedenTekrarliElementleriSilme.tekrarsizListeOlustur;

public class F05_ListiTekrarsizYap {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan 
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7] bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar= tekrarsizListeOlustur1(sayilar);
        System.out.println(sayilar);


    }





    public static List<Integer> tekrarsizListeOlustur1(List<Integer> sayilar) {

        List<Integer> tekrarsizList =new ArrayList<>();

        for (int i = 0; i <sayilar.size(); i++) {

            if (! tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));

            }
        }
        return tekrarsizList;
    }
}
