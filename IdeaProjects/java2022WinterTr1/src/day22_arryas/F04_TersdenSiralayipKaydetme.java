package day22_arryas;

import javax.management.timer.TimerNotification;
import java.util.Arrays;

public class F04_TersdenSiralayipKaydetme {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip bize donduren bir method olusturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        arr=tersetenSirala(arr);
        System.out.println(Arrays.toString(arr)); // [45, 25, 9, 9, 6, 5, 4, 3, 1, 0]


        System.out.println("En buyuk element : " + arr[0]);
        

    }

    public static int[] tersetenSirala(int[] arr) {

        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]= new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        for (int i = 0; i <arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];
        }
        return  tersArr;




}
}
