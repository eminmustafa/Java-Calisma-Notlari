package day22_arryas;

import java.util.Arrays;

public class F02_Sort {
    public static void main(String[] args) {
        // verilen bir array'da en kucuk ve en kucuk degerleri yazdirin

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        // sort methodu  olmadan yapalim

        int enKucukSayi = Integer.MAX_VALUE;  //arr[0];
        int enBuyukSayi = Integer.MIN_VALUE;  //arr[0];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < enKucukSayi) {

                enKucukSayi = arr[i];

            }
            if (arr[i] > enBuyukSayi) {
                enBuyukSayi = arr[i];

            }
        }
        System.out.println("Array'daki en kucuk sayi : "+ enKucukSayi);
        System.out.println("Array'daki en buyuk sayi : "+ enBuyukSayi);


        Arrays.sort(arr);
        System.out.println("Array'daki en kucuk sayi : "+ arr[0]);
        System.out.println("Array'daki en buyuk sayi : "+ arr[arr.length-1]);

    }
}
