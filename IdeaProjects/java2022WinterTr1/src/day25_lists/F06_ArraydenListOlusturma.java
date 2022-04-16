package day25_lists;

import java.util.Arrays;
import java.util.List;

public class F06_ArraydenListOlusturma {

    public static void main(String[] args) {
        // verilne birarray'i listeye cevirin

        String arr[]={"A" , "B" , "C"};
        List<String>  arraydenList= Arrays.asList(arr);

        // array'den liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisiyla bu yeni list ile add(), remove(), clear() gibi methodlar calistirmak
        // istedigimizde  Exception olusur

        // arraydenList.add("J"); // UnsupportedOperationException
        System.out.println("19.satirda list  : " + arraydenList);

        arr[1]="F";

        System.out.println("23.satirda Array : " + Arrays.toString(arr));
        System.out.println("24.satirda list  : " + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("28.satirda Array : " + Arrays.toString(arr));
        System.out.println("29.satirda list  : " + arraydenList);

    }
}
