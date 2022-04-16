package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class F04_Arrays {
    public static void main(String[] args) {

        // kullaniciya  kac elementlik bir array olasturacagini sorun
        // array'i olsturup elementleri kullanicidan alip, array'e atayin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yaziniz");

        int uzunluk= scan.nextInt(); // 5

        int arr[]=new int[uzunluk]; //[ 0, 0, 0, 0, 0]

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin "+ (i+1)+". eleman giriniz");
            arr[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 1]
    }
}
