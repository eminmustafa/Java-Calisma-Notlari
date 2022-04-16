package day23_multiDimensionalArrays;

import java.util.Scanner;

public class F07_MDArrays {
    public static void main(String[] args) {
        // Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        String arr[]=cumle.split(" ");

        System.out.println("Girdiginiz cumledeki kelime sayisi : " + arr.length);

    }
}
