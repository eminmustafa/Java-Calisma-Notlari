package day30_passByValue;

import java.util.Arrays;

public class F06_PassByValue {

    public static void main(String[] args) {

        /*
         non primitive data türlerinde objenin kendisi degilde
         icindeki elementler degisirse
         Java objenin referansi ve objenin endisi degismedigi icin
         element degisiklilşerini kabul eder ve kaici yapar
         */

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        arrDegistiri(arr);
        System.out.println("method call sonrasi : " + Arrays.toString(arr)); // [5, 6, 3]

    }

    private static void arrDegistiri(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr)); // [5, 6, 3]
    }
}
