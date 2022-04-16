package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class F04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin"); // Yusuf gitti yerine seckin geldi
        System.out.println(isimler); // [Aykut, Seckin, Ilker, Oguzhan]

        // daha onceden listede var olanalri da arsiv olarak tutmak istersek
        List<String> logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos"));

        System.out.println(isimler); // [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi); // [Ilker]



    }
}
