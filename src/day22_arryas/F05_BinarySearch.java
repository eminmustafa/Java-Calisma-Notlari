package day22_arryas;

import java.util.Arrays;

public class F05_BinarySearch {
    public static void main(String[] args) {

        // verilen array de istenen bir element var olup olmadigin, true/false yazdirarak
        // gosteren bir method olsturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=1;

        istenenElemanVarMi(arr,istenenSayi);







    }

    private static void istenenElemanVarMi(int[] arr, int istneenSayi) {

        boolean sonuc=false;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==istneenSayi){
                sonuc=true;
                break;
            }

        }

        System.out.println(sonuc);
    }
}
