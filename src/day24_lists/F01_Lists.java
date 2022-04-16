package day24_lists;

import day23_multiDimensionalArrays.F06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F01_Lists {
    public static void main(String[] args) {

        int arr[]={};

        // bu array'e 5 ekleyelim

        arr = F06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr)); // [5]



        // birde 3 ekleyelim

        arr= F06_Arrays.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr)); // [5, 3]


        //  bir list olusturalim

        List<Integer> sayilarList=  new ArrayList<>();
        System.out.println(sayilarList); // []

        sayilarList.add(5); // [5]
        sayilarList.add(3); // [5, 3]
        sayilarList.add(0,7); // [7, 5, 3]
        sayilarList.add(2,7); // [7, 5, 7, 3]
        System.out.println(sayilarList); // [7, 5, 7, 3]







    }
}
